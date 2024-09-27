package com.example.medicametos_judc

import android.app.NotificationManager
import android.content.Context
import androidx.core.app.NotificationCompat
import androidx.work.OneTimeWorkRequestBuilder
import androidx.work.WorkManager
import androidx.work.Worker
import androidx.work.WorkerParameters
import androidx.work.workDataOf
import java.util.concurrent.TimeUnit

class NotificationWorker(appContext: Context, workerParams: WorkerParameters) : Worker(appContext, workerParams) {

    override fun doWork(): Result {
        val medicamentoNombre = inputData.getString("medicamentoNombre")
        val intervalMinutes = inputData.getInt("intervalMinutes", 60) // Intervalo en minutos
        val days = inputData.getInt("days", 0) // Días restantes

        if (days <= 0) {
            return Result.success() // Ya no quedan días, terminar
        }

        // Mostrar notificación
        val notificationManager = applicationContext.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        val builder = NotificationCompat.Builder(applicationContext, "medicamento_channel")
            .setContentTitle("¡Es hora de tomar tu medicamento!")
            .setContentText("Debes tomar: $medicamentoNombre")
            .setSmallIcon(R.drawable.ic_notification)
            .setPriority(NotificationCompat.PRIORITY_HIGH)

        val notificationId = medicamentoNombre.hashCode()
        notificationManager.notify(notificationId, builder.build())

        // Calcular el tiempo hasta la siguiente notificación en milisegundos
        val nextNotificationDelay = TimeUnit.MINUTES.toMillis(intervalMinutes.toLong())

        // Actualizar los días restantes solo si ha pasado 1 día (1440 minutos = 24 horas)
        val newDays = if (intervalMinutes >= 1440) days - 1 else days

        if (newDays <= 0) {
            return Result.success() // Si ya no hay días restantes, no programar más notificaciones
        }

        // Crear un nuevo WorkRequest para la siguiente notificación
        val workRequest = OneTimeWorkRequestBuilder<NotificationWorker>()
            .setInitialDelay(nextNotificationDelay, TimeUnit.MILLISECONDS)
            .setInputData(workDataOf(
                "medicamentoNombre" to medicamentoNombre,
                "intervalMinutes" to intervalMinutes,
                "days" to newDays
            ))
            .addTag(medicamentoNombre ?: "medicamento_generico") // Utilizamos el nombre del medicamento como tag
            .build()

        WorkManager.getInstance(applicationContext).enqueue(workRequest)

        return Result.success()
    }
}



