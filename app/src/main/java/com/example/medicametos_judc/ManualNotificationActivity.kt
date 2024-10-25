package com.example.medicametos_judc

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.medicametos_judc.databinding.ActivityManualNotificationBinding

class ManualNotificationActivity : AppCompatActivity() {

    private lateinit var binding: ActivityManualNotificationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityManualNotificationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBackActivity.setOnClickListener { finish() }
    }
}