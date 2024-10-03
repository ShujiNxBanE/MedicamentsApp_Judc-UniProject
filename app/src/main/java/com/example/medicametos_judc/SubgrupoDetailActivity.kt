package com.example.medicametos_judc

import android.content.Intent
import android.os.Bundle
import android.view.Gravity
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.example.medicametos_judc.databinding.ActivitySubgrupoDetailBinding

@Suppress("DEPRECATION")
class SubgrupoDetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySubgrupoDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySubgrupoDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val subgrupo = intent.getParcelableExtra<Subgrupo>("subgrupo")

        binding.back.setOnClickListener { finish() }

        if (subgrupo != null) {
            // Mostrar detalles del subgrupo
            binding.tvApp.text = subgrupo.nombre

            // Limpiar el LinearLayout antes de agregar nuevos botones (por si se reutiliza la vista)
            binding.medicaments.removeAllViews()

            // Crear botones dinámicamente para cada medicamento y añadirlos al LinearLayout
            for (medicamento in subgrupo.medicamentos) {
                val button = Button(this).apply {
                    text = medicamento.nombre
                    layoutParams = LinearLayout.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT
                    ).apply {
                        setMargins(16, 16, 16, 16) // Añadir márgenes entre botones
                    }

                    // Aplicar los estilos
                    backgroundTintList = ContextCompat.getColorStateList(context, R.color.btn_color) // Color de fondo
                    setTextColor(ContextCompat.getColor(context, android.R.color.white)) // Color del texto
                    setPadding(16, 16, 16, 16) // Padding
                    textSize = 18f // Tamaño del texto
                    gravity = Gravity.CENTER // Alinear texto al centro
                    elevation = 8f // Elevación
                    setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.baseline_arrow_forward_24, 0) // Ícono a la derecha
                    compoundDrawablePadding = 8 // Espaciado entre texto e ícono

                    setOnClickListener {
                        // Crear un Intent para iniciar la nueva actividad
                        val intent = Intent(this@SubgrupoDetailActivity, MedicamentoDetailActivity::class.java)

                        // Pasar el medicamento seleccionado
                        intent.putExtra("medicamento", medicamento)

                        // Iniciar la nueva actividad
                        startActivity(intent)
                    }
                }
                // Añadir el botón al LinearLayout
                binding.medicaments.addView(button)
            }
        }
    }
}