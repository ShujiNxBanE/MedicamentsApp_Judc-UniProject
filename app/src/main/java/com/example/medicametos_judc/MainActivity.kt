package com.example.medicametos_judc

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.medicametos_judc.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val capitulos = DataProvider.obtenerCapitulos()
        val medicamentos = capitulos.flatMap { it -> it.subgrupos.flatMap { it.medicamentos } }

        // Crear botones dinámicamente y añadirlos al LinearLayout
        mostrarCapitulos(capitulos)

        // Configurar el buscador de medicamentos
        binding.btnSearchMedicament.setOnClickListener {
            val query = binding.etSearchMedicament.text.toString().trim()
            if (query.isNotEmpty()) {
                searchMedicaments(query, medicamentos)

                // Ocultar el teclado
                val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
                imm.hideSoftInputFromWindow(binding.etSearchMedicament.windowToken, 0)
            }
        }

        // Configurar un TextWatcher para filtrar mientras se escribe
        binding.etSearchMedicament.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                val query = s.toString().trim()
                if (query.isNotEmpty()) {
                    searchMedicaments(query, medicamentos)
                } else {
                    // Si no hay query, mostramos los capítulos de nuevo
                    mostrarCapitulos(capitulos)
                }
            }

            override fun afterTextChanged(s: Editable?) {}
        })
    }

    private fun mostrarCapitulos(capitulos: List<Capitulo>) {
        // Ocultar los resultados de búsqueda y mostrar capítulos
        binding.searchResults.visibility = LinearLayout.GONE
        binding.chapters.visibility = LinearLayout.VISIBLE
        binding.labelChapters.visibility = TextView.VISIBLE

        // Limpiar el LinearLayout antes de agregar nuevos botones
        binding.chapters.removeAllViews()

        // Crear botones dinámicamente para cada capítulo
        for (capitulo in capitulos) {
            val button = Button(this).apply {
                text = capitulo.nombre
                layoutParams = LinearLayout.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.WRAP_CONTENT
                )
                setOnClickListener {
                    // Inicia la nueva actividad y pasa el objeto Capitulo completo
                    val intent = Intent(this@MainActivity, CapituloDetailActivity::class.java).apply {
                        putExtra("capitulo", capitulo)
                    }
                    startActivity(intent)
                }
            }

            // Añadir el botón al LinearLayout
            binding.chapters.addView(button)
        }
    }

    private fun searchMedicaments(query: String, medicamentos: List<Medicamento>) {
        // Ocultar capítulos y mostrar resultados de búsqueda
        binding.chapters.visibility = LinearLayout.GONE
        binding.searchResults.visibility = LinearLayout.VISIBLE
        binding.labelChapters.visibility = TextView.GONE

        // Limpiar el LinearLayout antes de agregar nuevos botones
        binding.searchResults.removeAllViews()

        // Filtrar los medicamentos según la query
        val filteredMedicaments = medicamentos.filter {
            it.nombre.contains(query, ignoreCase = true)
        }

        // Crear botones dinámicamente para cada medicamento filtrado y añadirlos al LinearLayout
        for (medicamento in filteredMedicaments) {
            val button = Button(this).apply {
                text = medicamento.nombre
                layoutParams = LinearLayout.LayoutParams(
                    ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.WRAP_CONTENT
                )
                setOnClickListener {
                    // Inicia la actividad de detalles del medicamento y pasa el objeto Medicamento completo
                    val intent =
                        Intent(this@MainActivity, MedicamentoDetailActivity::class.java).apply {
                            putExtra("medicamento", medicamento)
                        }
                    startActivity(intent)
                }
            }

            // Añadir el botón al LinearLayout
            binding.searchResults.addView(button)
        }
    }
}