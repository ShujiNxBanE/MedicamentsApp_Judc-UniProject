package com.example.medicametos_judc

import android.content.Intent
import android.os.Bundle
import android.view.Gravity
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.medicametos_judc.databinding.ActivityCapituloDetailBinding

class CapituloDetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCapituloDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCapituloDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val capitulo = intent.getParcelableExtra<Capitulo>("capitulo")

        if (capitulo != null) {
            // Mostrar nombre y descripción del capítulo
            binding.tvApp.text = capitulo.nombre

            // Limpiar el LinearLayout antes de agregar nuevos botones (por si se reutiliza la vista)
            binding.subgroups.removeAllViews()

            for (subgrupo in capitulo.subgrupos) {
                val button = Button(this).apply {
                    text = subgrupo.nombre
                    layoutParams = LinearLayout.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT
                    ).apply {
                        setMargins(16, 16, 16, 16) // Añadir márgenes entre botones
                    }

                    // Aplicar los mismos estilos que en el otro código
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
                        val intent = Intent(this@CapituloDetailActivity, SubgrupoDetailActivity::class.java)

                        // Pasar el subgrupo seleccionado con los medicamentos
                        intent.putExtra("subgrupo", subgrupo)

                        // Iniciar la nueva actividad
                        startActivity(intent)
                    }
                }
                // Añadir el botón al LinearLayout
                binding.subgroups.addView(button)
            }
        }
    }
}