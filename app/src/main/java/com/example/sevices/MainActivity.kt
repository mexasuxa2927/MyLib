package com.example.sevices

import android.app.job.JobInfo
import android.app.job.JobScheduler
import android.app.job.JobService
import android.content.ComponentName
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import com.example.mylib.MyLib
import com.example.sevices.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding :ActivityMainBinding

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        binding =  ActivityMainBinding.inflate(layoutInflater)

        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        var builder :JobInfo.Builder  = JobInfo.Builder(1 , ComponentName(this,MyService2::class.java))
        builder.setRequiresBatteryNotLow(true)

        var secheudler  = getSystemService(JOB_SCHEDULER_SERVICE) as JobScheduler


        binding.button.setOnClickListener {
            secheudler.schedule(builder.build())

        }

        binding.button1.setOnClickListener {
            secheudler.cancel(1)

        }

        MyLib().getToast(this,"asdawdad")

    }
}