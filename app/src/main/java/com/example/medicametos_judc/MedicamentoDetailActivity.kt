package com.example.medicametos_judc

import NotificationWorker
import android.annotation.SuppressLint
import android.app.Dialog
import android.os.Bundle
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.TimePicker
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.work.OneTimeWorkRequestBuilder
import androidx.work.WorkManager
import androidx.work.workDataOf
import com.example.medicametos_judc.databinding.ActivityMedicamentoDetailBinding
import java.util.Calendar
import java.util.concurrent.TimeUnit

@Suppress("DEPRECATION")
class MedicamentoDetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMedicamentoDetailBinding

    @SuppressLint("DiscouragedApi")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMedicamentoDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val medicamento = intent.getParcelableExtra<Medicamento>("medicamento")

        if (medicamento != null) {
            // Mostrar detalles del medicamento
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
                            250,
                            250
                        ).apply {
                            setMargins(16, 16, 16, 16) // Añadir márgenes si es necesario
                        }
                        scaleType =
                            ImageView.ScaleType.CENTER_CROP // Ajusta esto según lo necesites
                    }

                    imageView.setOnClickListener {
                        // Crear y mostrar un Dialog con la imagen en pantalla completa
                        val dialog = Dialog(this@MedicamentoDetailActivity)
                        dialog.setContentView(R.layout.dialog_image_fullscreen)

                        // Configurar la imagen en el Dialog
                        val imageFullScreen = dialog.findViewById<ImageView>(R.id.image_fullscreen)
                        imageFullScreen.setImageResource(imageResId)

                        // Ajustar el tamaño de la imagen
                        val desiredWidth = 1200  // Definir el ancho deseado
                        val desiredHeight = 1000 // Definir la altura deseada

                        val layoutParams = imageFullScreen.layoutParams
                        layoutParams.width = desiredWidth
                        layoutParams.height = desiredHeight
                        imageFullScreen.layoutParams = layoutParams
                        // Mostrar el Dialog
                        dialog.show()
                    }


                    // Añadir el ImageView al LinearLayout
                    binding.medicamentImages.addView(imageView)
                }
            }

            // Ahora generar los TextViews dinámicamente para las indicaciones
            generarIndicaciones(medicamento.indicaciones)

            binding.btnTakeMedicament.setOnClickListener {
                showScheduleDialog(medicamento)
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

    // Función para mostrar el diálogo de programación de la toma de medicamentos
    private fun showScheduleDialog(medicamento: Medicamento?) {
        val dialog = Dialog(this)
        dialog.setContentView(R.layout.dialog_schedule_medicament)

        val timePicker = dialog.findViewById<TimePicker>(R.id.timePicker)
        val etDays = dialog.findViewById<EditText>(R.id.etDays)
        val etWeeks = dialog.findViewById<EditText>(R.id.etWeeks)
        val etMonths = dialog.findViewById<EditText>(R.id.etMonths)
        val btnSchedule = dialog.findViewById<Button>(R.id.btnSchedule)

        timePicker.setIs24HourView(true)

        btnSchedule.setOnClickListener {
            val hour = timePicker.hour
            val minute = timePicker.minute
            val days = etDays.text.toString().toIntOrNull() ?: 0
            val weeks = etWeeks.text.toString().toIntOrNull() ?: 0
            val months = etMonths.text.toString().toIntOrNull() ?: 0

            // Calcular el tiempo total en milisegundos
            val durationInMillis = calculateDurationInMillis(days, weeks, months)

            // Programar la notificación
            scheduleNotification(medicamento, hour, minute, durationInMillis)

            Toast.makeText(this, "Programación guardada", Toast.LENGTH_SHORT).show()
            dialog.dismiss()
        }

        dialog.show()
    }

    // Función para calcular el tiempo en milisegundos de los días, semanas y meses
    private fun calculateDurationInMillis(days: Int, weeks: Int, months: Int): Long {
        val daysInMillis = TimeUnit.DAYS.toMillis(days.toLong())
        val weeksInMillis = TimeUnit.DAYS.toMillis((weeks * 7).toLong())
        val monthsInMillis = TimeUnit.DAYS.toMillis((months * 30).toLong())
        return daysInMillis + weeksInMillis + monthsInMillis
    }

    // Función para programar la notificación
    private fun scheduleNotification(medicamento: Medicamento?, hour: Int, minute: Int, durationInMillis: Long) {
        val currentTime = Calendar.getInstance()
        val targetTime = Calendar.getInstance().apply {
            set(Calendar.HOUR_OF_DAY, hour)
            set(Calendar.MINUTE, minute)
            set(Calendar.SECOND, 0)
        }

        if (currentTime.after(targetTime)) {
            targetTime.add(Calendar.DAY_OF_YEAR, 1) // Si la hora ya pasó, prográmalo para el día siguiente
        }

        val initialDelay = targetTime.timeInMillis - currentTime.timeInMillis

        // Configurar la notificación usando WorkManager
        val workRequest = OneTimeWorkRequestBuilder<NotificationWorker>()
            .setInitialDelay(initialDelay + durationInMillis, TimeUnit.MILLISECONDS)
            .setInputData(workDataOf(
                "medicamentoNombre" to medicamento?.nombre
            ))
            .build()

        WorkManager.getInstance(this).enqueue(workRequest)
    }

    // Función para eliminar la programación de un medicamento
    private fun cancelScheduledNotification() {
        WorkManager.getInstance(this).cancelAllWork()
        Toast.makeText(this, "Programación eliminada", Toast.LENGTH_SHORT).show()
    }
}