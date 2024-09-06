package com.example.medicametos_judc

import android.os.Bundle
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

            // Aquí puedes mostrar los detalles adicionales como indicaciones, contraindicaciones, etc.
        }
    }
}