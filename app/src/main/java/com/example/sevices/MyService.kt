package com.example.sevices

import android.app.Service
import android.content.Intent

import android.media.MediaPlayer
import android.os.IBinder
import android.provider.Settings
import android.widget.Toast

class MyService : Service() {
    private lateinit var player: MediaPlayer

    override fun onBind(p0: Intent?): IBinder? {
        return null
    }

    override fun onCreate() {


        super.onCreate()
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        player = MediaPlayer.create(this,Settings.System.DEFAULT_NOTIFICATION_URI)
        player.isLooping = true
        player.start()
        Toast.makeText(this, "start", Toast.LENGTH_SHORT).show()
        return super.onStartCommand(intent, flags, startId)
    }

    override fun onDestroy() {
        player.stop()
        Toast.makeText(this, "stop", Toast.LENGTH_SHORT).show()
        super.onDestroy()
    }

}