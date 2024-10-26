package com.example.medicametos_judc

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Typeface
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.Gravity
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.example.medicametos_judc.databinding.ActivityMedicamentosEspecialesBinding

@Suppress("DEPRECATION")
class MedicamentosEspecialesActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMedicamentosEspecialesBinding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMedicamentosEspecialesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Obtener la lista de capítulos especiales
        val capitulosEspeciales = intent.getParcelableArrayListExtra<Capitulo>("capitulosEspeciales")

        // Crear una lista de todos los medicamentos de los capítulos especiales
        // Crear una lista de pares (Medicamento, nombre del subgrupo) en lugar de solo Medicamento
        val medicamentosEspeciales = capitulosEspeciales?.flatMap { capitulo ->
            capitulo.subgrupos.flatMap { subgrupo ->
                subgrupo.medicamentos.map { medicamento ->
                    Pair(medicamento, subgrupo.nombre) // Empareja medicamento con el nombre del subgrupo
                }
            }
        }

        binding.back.setOnClickListener { finish() }

        // Verificar que la lista no sea nula
        if (capitulosEspeciales != null && medicamentosEspeciales != null) {
            // Mostrar capítulos por defecto
            mostrarCapitulosEspeciales(capitulosEspeciales)

            // Configurar el botón de búsqueda
            binding.btnSearchMedicament.setOnClickListener {
                val query = binding.etSearchMedicament.text.toString().trim()
                if (query.isNotEmpty()) {
                    searchMedicaments(query, medicamentosEspeciales)
                } else {
                    mostrarCapitulosEspeciales(capitulosEspeciales)
                }
                // Ocultar teclado después de la búsqueda
                val imm = getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
                imm.hideSoftInputFromWindow(binding.etSearchMedicament.windowToken, 0)
            }

            // Configurar el TextWatcher para la búsqueda en tiempo real
            binding.etSearchMedicament.addTextChangedListener(object : TextWatcher {
                override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
                override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                    val query = s.toString().trim()
                    if (query.isNotEmpty()) {
                        searchMedicaments(query, medicamentosEspeciales)
                    } else {
                        mostrarCapitulosEspeciales(capitulosEspeciales)
                    }
                }

                override fun afterTextChanged(s: Editable?) {}
            })
        } else {
            binding.labelChapters.text = "No hay capítulos especiales disponibles."
        }
    }
    private fun mostrarCapitulosEspeciales(capitulosEspeciales: List<Capitulo>) {
        binding.labelChapters.visibility = TextView.VISIBLE // Mostrar el título
        binding.chapters.removeAllViews() // Limpiar capítulos anteriores
        binding.searchResults.removeAllViews() // Limpiar resultados de búsqueda
        binding.chapters.visibility = LinearLayout.VISIBLE
        binding.searchResults.visibility = LinearLayout.GONE

        // Mostrar capítulos y subgrupos
        for (capitulo in capitulosEspeciales) {
            val capituloTextView = crearCapituloTextView(capitulo)
            binding.chapters.addView(capituloTextView)

            for (subgrupo in capitulo.subgrupos) {
                val subgrupoTextView = crearSubgrupoTextView(subgrupo)
                binding.chapters.addView(subgrupoTextView)

                for (medicamento in subgrupo.medicamentos) {
                    // Pasa el nombre del subgrupo al crear el botón del medicamento
                    val medicamentoButton = crearMedicamentoButton(medicamento, subgrupo.nombre)
                    binding.chapters.addView(medicamentoButton)
                }
            }
        }
    }

    private fun searchMedicaments(query: String, medicamentosEspeciales: List<Pair<Medicamento, String>>) {
        binding.labelChapters.visibility = TextView.GONE // Ocultar el título
        binding.chapters.visibility = LinearLayout.GONE
        binding.searchResults.visibility = LinearLayout.VISIBLE
        binding.searchResults.removeAllViews() // Limpiar resultados anteriores

        // Filtrar medicamentos que coincidan con la búsqueda
        val filteredMedicaments = medicamentosEspeciales.filter { (medicamento, _) ->
            medicamento.nombre.contains(query, ignoreCase = true)
        }

        // Mostrar resultados filtrados
        if (filteredMedicaments.isNotEmpty()) {
            for ((medicamento, subgrupoNombre) in filteredMedicaments) {
                val medicamentoButton = crearMedicamentoButton(medicamento, subgrupoNombre)
                binding.searchResults.addView(medicamentoButton)
            }
        }
    }

    // Métodos auxiliares para crear las vistas (TextView, Button)
    private fun crearCapituloTextView(capitulo: Capitulo): TextView {
        return TextView(this).apply {
            text = capitulo.nombre
            textSize = 18f
            setTypeface(typeface, Typeface.BOLD)
            setTextColor(ContextCompat.getColor(context, R.color.white))
            setBackgroundColor(ContextCompat.getColor(context, R.color.app_tittle))
            gravity = Gravity.CENTER
            elevation = 4f
            layoutParams = LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
            ).apply {
                setMargins(0, 16, 0, 8)
            }
            setPadding(16, 16, 16, 16)
        }
    }

    private fun crearSubgrupoTextView(subgrupo: Subgrupo): TextView {
        return TextView(this).apply {
            text = subgrupo.nombre
            textSize = 18f
            setTypeface(typeface, Typeface.BOLD)
            setTextColor(ContextCompat.getColor(context, android.R.color.white))
            setBackgroundColor(ContextCompat.getColor(context, R.color.btn_color))
            gravity = Gravity.START
            layoutParams = LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
            ).apply {
                setMargins(0, 8, 0, 8)
            }
            setPadding(16, 8, 16, 8)
        }
    }
    private fun crearMedicamentoButton(medicamento: Medicamento, subgrupoNombre: String): Button {
        return Button(this).apply {
            text = medicamento.nombre
            layoutParams = LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
            ).apply {
                setMargins(48, 8, 16, 16)
            }
            backgroundTintList = ContextCompat.getColorStateList(context, R.color.btn_color)
            setTextColor(ContextCompat.getColor(context, android.R.color.white))
            setPadding(16, 16, 16, 16)
            textSize = 16f
            gravity = Gravity.CENTER
            elevation = 8f
            setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.baseline_arrow_forward_24, 0)
            compoundDrawablePadding = 8

            setOnClickListener {
                val intent = Intent(this@MedicamentosEspecialesActivity, MedicamentoDetailActivity::class.java).apply {
                    putExtra("medicamento", medicamento)
                    putExtra("subgrupoNombre", subgrupoNombre) // Pasar el nombre del subgrupo
                }
                startActivity(intent)
            }
        }
    }
}
