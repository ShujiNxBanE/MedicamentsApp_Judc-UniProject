package com.example.medicametos_judc

import android.annotation.SuppressLint
import android.app.AlarmManager
import android.app.DatePickerDialog
import android.app.Dialog
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.view.ViewGroup
import android.view.Window
import android.widget.Button
import android.widget.EditText
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.TimePicker
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.work.WorkManager
import com.example.medicametos_judc.databinding.ActivityMedicamentoDetailBinding
import java.util.Calendar


@Suppress("DEPRECATION", "LABEL_NAME_CLASH")
class MedicamentoDetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMedicamentoDetailBinding

    @SuppressLint("DiscouragedApi", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMedicamentoDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val medicamento = intent.getParcelableExtra<Medicamento>("medicamento")

        if (medicamento != null) {
            // Mostrar detalles del medicamento
            binding.tvApp.text = medicamento.nombre
            binding.medicamentName.text = medicamento.nombre
            binding.medicamentDescription.text = medicamento.descripcion

            // Limpiar el LinearLayout antes de agregar nuevas imágenes (por si se reutiliza la vista)
            binding.medicamentImages.removeAllViews()

            // Iterar sobre las imágenes del medicamento
            for ((index, _) in medicamento.imagenesResIds.withIndex()) {
                // Generar el nombre del recurso basado en el nombre del medicamento y el índice
                val imageName = "${medicamento.nombre.lowercase()}_${index + 1}"

                // Obtener el ID del recurso de la imagen desde drawable
                val imageResId = resources.getIdentifier(imageName, "drawable", packageName)

                if (imageResId != 0) { // Asegurarse de que el recurso existe
                    // Crear un ImageView dinámicamente
                    val imageView = ImageView(this).apply {
                        setImageResource(imageResId)
                        layoutParams = LinearLayout.LayoutParams(
                            150,
                            150
                        ).apply {
                            setMargins(16, 16, 16, 16) // Añadir márgenes si es necesario
                        }
                        scaleType =
                            ImageView.ScaleType.CENTER_CROP // Ajusta esto según lo necesites
                    }

                    imageView.setOnClickListener {
                        // Crear y mostrar un Dialog con la imagen en pantalla completa
                        val dialog = Dialog(this@MedicamentoDetailActivity)
                        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE) // Quitar título
                        dialog.setContentView(R.layout.dialog_image_fullscreen)

                        // Configurar la imagen en el Dialog
                        val imageFullScreen = dialog.findViewById<ImageView>(R.id.image_fullscreen)
                        imageFullScreen.setImageResource(imageResId)

                        // Obtener el tamaño de la pantalla
                        val displayMetrics = resources.displayMetrics
                        val screenWidth = displayMetrics.widthPixels
                        val screenHeight = displayMetrics.heightPixels

                        // Calcular el 70% del tamaño de la pantalla
                        val desiredWidth = (screenWidth * 0.7).toInt()
                        val desiredHeight = (screenHeight * 0.7).toInt()

                        // Ajustar el tamaño de la imagen
                        val layoutParams = imageFullScreen.layoutParams
                        layoutParams.width = desiredWidth
                        layoutParams.height = desiredHeight
                        imageFullScreen.layoutParams = layoutParams

                        // Ajustar el tamaño del Dialog para que se ajuste al contenido
                        dialog.window?.setLayout(FrameLayout.LayoutParams.WRAP_CONTENT, FrameLayout.LayoutParams.WRAP_CONTENT)

                        // Mostrar el Dialog
                        dialog.show()
                    }
                    // Añadir el ImageView al LinearLayout
                    binding.medicamentImages.addView(imageView)
                }
            }

            // Ahora generar los TextViews dinámicamente para las indicaciones
            generarIndicaciones(medicamento.indicaciones)

            binding.medicamentContraindications.text = medicamento.contraindicaciones.toString()

            createNotificationChannel()

            if (isMedicamentoProgrammed(medicamento)) {
                binding.btnTakeMedicament.text = "Cancelar Programación"
            } else {
                binding.btnTakeMedicament.text = "Programar Medicamento"
            }


            binding.btnTakeMedicament.setOnClickListener {

                if (binding.btnTakeMedicament.text == "Cancelar Programación") {
                    WorkManager.getInstance(this).cancelAllWorkByTag(medicamento.nombre)
                    saveProgrammingState(medicamento, false)
                    binding.btnTakeMedicament.text = "Programar Medicamento"
                    Toast.makeText(this, "Programación cancelada", Toast.LENGTH_SHORT).show()
                } else {
                    // Crear el Dialog
                    val dialog = Dialog(this)
                    dialog.setContentView(R.layout.dialog_schedule_medicament)

                    val timePicker = dialog.findViewById<TimePicker>(R.id.timePicker)
                    val etHours = dialog.findViewById<EditText>(R.id.etHours)
                    val etDays = dialog.findViewById<EditText>(R.id.etDays)
                    val btnSelectDate = dialog.findViewById<Button>(R.id.btnSelectDate)
                    val btnSchedule = dialog.findViewById<Button>(R.id.btnSchedule)

                    var selectedYear = 0
                    var selectedMonth = 0
                    var selectedDay = 0

                    // Mostrar el DatePickerDialog cuando se selecciona la fecha
                    btnSelectDate.setOnClickListener {
                        val calendar = Calendar.getInstance()
                        val year = calendar.get(Calendar.YEAR)
                        val month = calendar.get(Calendar.MONTH)
                        val day = calendar.get(Calendar.DAY_OF_MONTH)

                        val datePickerDialog = DatePickerDialog(this, { _, pickedYear, pickedMonth, pickedDay ->
                            selectedYear = pickedYear
                            selectedMonth = pickedMonth
                            selectedDay = pickedDay
                            btnSelectDate.text = "$pickedDay/${pickedMonth + 1}/$pickedYear"
                        }, year, month, day)
                        datePickerDialog.show()
                    }

                    btnSchedule.setOnClickListener {
                        // Obtener la hora seleccionada
                        val hour = timePicker.hour
                        val minute = timePicker.minute

                        // Obtener la cantidad de horas y días
                        val hoursInterval = etHours.text.toString().toIntOrNull() ?: 0
                        val days = etDays.text.toString().toIntOrNull() ?: 0

                        // Asegurarse de que el usuario seleccionó una fecha válida
                        if (selectedYear == 0 || selectedMonth == 0 || selectedDay == 0) {
                            Toast.makeText(this, "Por favor, selecciona una fecha", Toast.LENGTH_SHORT).show()
                            return@setOnClickListener
                        }

                        // Crear un Calendar con la fecha y hora seleccionadas
                        val calendar = Calendar.getInstance()
                        calendar.set(selectedYear, selectedMonth, selectedDay, hour, minute, 0)

                        // Programar la notificación usando WorkManager
                        scheduleNotification(medicamento.nombre, calendar.timeInMillis, hoursInterval, days)

                        // Programar medicamento
                        saveProgrammingState(medicamento, true)
                        // Cambiar el texto del botón a "Cancelar Programación"
                        binding.btnTakeMedicament.text = "Cancelar Programación"

                        // Cerrar el dialog
                        dialog.dismiss()
                    }

                    // Mostrar el Dialog
                    dialog.show()
                }
            }
        }
    }

    private fun generarIndicaciones(indicaciones: List<String>) {
        // Limpiar el LinearLayout por si ya tiene elementos previos
        binding.medicamentIndications.removeAllViews()

        // Iterar sobre cada indicación y agregarla como un TextView al LinearLayout
        for (indicacion in indicaciones) {
            val textView = TextView(this).apply {
                text = indicacion
                layoutParams = LinearLayout.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.WRAP_CONTENT
                ).apply {
                    setMargins(16, 8, 16, 8) // Añadir márgenes si es necesario
                }
                textSize = 16f // Ajustar el tamaño de texto
                setTextColor(ContextCompat.getColor(context, R.color.black)) // Color del texto
            }

            // Añadir el TextView al LinearLayout
            binding.medicamentIndications.addView(textView)
        }
    }

    @SuppressLint("ScheduleExactAlarm")
    private fun scheduleNotification(medicamentoNombre: String, startTimeInMillis: Long, intervalHours: Int, days: Int) {
        val alarmManager = getSystemService(Context.ALARM_SERVICE) as AlarmManager

        // Calcular el total de horas: días * 24
        val totalHours = days * 24

        // Crear un intent para enviar el nombre del medicamento al BroadcastReceiver
        val intent = Intent(this, NotificationReceiver::class.java).apply {
            putExtra("medicamentoNombre", medicamentoNombre)
            putExtra("remainingHours", totalHours) // Enviar las horas totales en lugar de los días
            putExtra("intervalHours", intervalHours)
        }

        val pendingIntent = PendingIntent.getBroadcast(
            this,
            medicamentoNombre.hashCode(), // ID único para cada medicamento
            intent,
            PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_IMMUTABLE // Para actualizar si ya está programado
        )

        // Programar la alarma con AlarmManager
        alarmManager.setExactAndAllowWhileIdle(
            AlarmManager.RTC_WAKEUP, // Usar RTC_WAKEUP para despertarse si el dispositivo está en reposo
            startTimeInMillis, // Tiempo de inicio de la alarma
            pendingIntent
        )

        Toast.makeText(this, "Notificación programada para $medicamentoNombre", Toast.LENGTH_SHORT).show()
    }




    private fun createNotificationChannel() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val name = "Canal de Medicamentos"
            val descriptionText = "Recordatorio de medicamentos"
            val importance = NotificationManager.IMPORTANCE_HIGH
            val channel = NotificationChannel("medicamento_channel", name, importance).apply {
                description = descriptionText
            }

            val notificationManager: NotificationManager =
                getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            notificationManager.createNotificationChannel(channel)
        }
    }

    // Función para guardar el estado de programación en SharedPreferences
    private fun saveProgrammingState(medicamento: Medicamento, isProgrammed: Boolean) {
        val sharedPref = getSharedPreferences("medicamento_prefs", Context.MODE_PRIVATE)
        with(sharedPref.edit()) {
            putBoolean(medicamento.nombre, isProgrammed)
            apply()
        }
    }

    // Función para recuperar el estado de programación desde SharedPreferences
    private fun isMedicamentoProgrammed(medicamento: Medicamento): Boolean {
        val sharedPref = getSharedPreferences("medicamento_prefs", Context.MODE_PRIVATE)
        return sharedPref.getBoolean(medicamento.nombre, false)
    }

}