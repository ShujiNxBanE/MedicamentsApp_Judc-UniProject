package com.example.medicametos_judc

import android.content.Intent
import android.os.Bundle
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.medicametos_judc.databinding.ActivitySubgrupoDetailBinding

class SubgrupoDetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySubgrupoDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySubgrupoDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val subgrupo = intent.getParcelableExtra<Subgrupo>("subgrupo")

        if (subgrupo != null) {
            // Mostrar detalles del subgrupo
            binding.subgrupoNombreTextView.text = subgrupo.nombre
            binding.subgrupoDescripcionTextView.text = subgrupo.descripcion

            // Limpiar el LinearLayout antes de agregar nuevos botones (por si se reutiliza la vista)
            binding.medicaments.removeAllViews()

            // Crear botones dinámicamente para cada medicamento y añadirlos al LinearLayout
            for (medicamento in subgrupo.medicamentos) {
                val button = Button(this).apply {
                    text = medicamento.nombre
                    layoutParams = LinearLayout.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT
                    )
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