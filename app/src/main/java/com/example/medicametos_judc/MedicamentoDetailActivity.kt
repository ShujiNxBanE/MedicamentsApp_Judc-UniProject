package com.example.medicametos_judc

import android.app.Dialog
import android.os.Bundle
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.medicametos_judc.databinding.ActivityMedicamentoDetailBinding

class MedicamentoDetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMedicamentoDetailBinding

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
        }
    }
}