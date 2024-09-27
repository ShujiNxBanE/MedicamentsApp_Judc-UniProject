package com.example.medicametos_judc

import android.annotation.SuppressLint
import android.app.AlarmManager
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import androidx.core.app.NotificationCompat
import java.util.concurrent.TimeUnit

class NotificationReceiver : BroadcastReceiver() {

    @SuppressLint("ScheduleExactAlarm")
    override fun onReceive(context: Context, intent: Intent?) {
        val medicamentoNombre = intent?.getStringExtra("medicamentoNombre")
        val remainingHours = intent?.getIntExtra("remainingHours", 0) ?: 0
        val intervalHours = intent?.getIntExtra("intervalHours", 0) ?: 0

        // Mostrar la notificación
        val notificationManager = context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        val builder = NotificationCompat.Builder(context, "medicamento_channel")
            .setContentTitle("¡Es hora de tomar tu medicamento!")
            .setContentText("Debes tomar: $medicamentoNombre")
            .setSmallIcon(R.drawable.ic_notification)
            .setPriority(NotificationCompat.PRIORITY_HIGH)

        val notificationId = medicamentoNombre?.hashCode() ?: 0
        notificationManager.notify(notificationId, builder.build())

        // Si aún hay horas restantes, reprogramar la alarma para la próxima notificación
        if (remainingHours > intervalHours) {
            val nextAlarmTime = System.currentTimeMillis() + TimeUnit.HOURS.toMillis(intervalHours.toLong())
            val updatedRemainingHours = remainingHours - intervalHours

            // Reprogramar la siguiente notificación
            val alarmManager = context.getSystemService(Context.ALARM_SERVICE) as AlarmManager
            val newIntent = Intent(context, NotificationReceiver::class.java).apply {
                putExtra("medicamentoNombre", medicamentoNombre)
                putExtra("remainingHours", updatedRemainingHours) // Actualizar las horas restantes
                putExtra("intervalHours", intervalHours)
            }

            val pendingIntent = PendingIntent.getBroadcast(
                context,
                medicamentoNombre?.hashCode() ?: 0,
                newIntent,
                PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_IMMUTABLE
            )

            // Usar setExactAndAllowWhileIdle para alarmas precisas
            alarmManager.setExactAndAllowWhileIdle(
                AlarmManager.RTC_WAKEUP,
                nextAlarmTime,
                pendingIntent
            )
        }
    }

}
