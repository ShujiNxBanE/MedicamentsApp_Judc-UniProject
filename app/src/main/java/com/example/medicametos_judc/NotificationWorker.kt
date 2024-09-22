package com.example.medicametos_judc

import android.app.NotificationManager
import android.content.Context
import androidx.core.app.NotificationCompat
import androidx.work.Worker
import androidx.work.WorkerParameters

class NotificationWorker(appContext: Context, workerParams: WorkerParameters) : Worker(appContext, workerParams) {

    override fun doWork(): Result {
        val medicamentoNombre = inputData.getString("medicamentoNombre")
        val notificationManager = applicationContext.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager

        // Crear la notificación
        val builder = NotificationCompat.Builder(applicationContext, "medicamento_channel")
            .setContentTitle("¡Es hora de tomar tu medicamento!")
            .setContentText("Debes tomar: $medicamentoNombre")
            .setSmallIcon(R.drawable.ic_notification)
            .setPriority(NotificationCompat.PRIORITY_HIGH)

        val notificationId = medicamentoNombre.hashCode()

        notificationManager.notify(notificationId, builder.build())

        return Result.success()
    }
}


