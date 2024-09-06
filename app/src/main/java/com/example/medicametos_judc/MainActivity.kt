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
import com.example.medicametos_judc.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val capitulos = DataProvider.obtenerCapitulos()

        // Crear botones dinámicamente y añadirlos al LinearLayout
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
}