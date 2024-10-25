package com.example.medicametos_judc

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.medicametos_judc.databinding.ActivityManualPrincipalBinding

class ManualPrincipalActivity : AppCompatActivity() {

    private lateinit var binding: ActivityManualPrincipalBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityManualPrincipalBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBackActivity.setOnClickListener { finish() }
    }
}