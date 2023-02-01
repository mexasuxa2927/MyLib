package com.example.sevices

import android.app.job.JobParameters
import android.app.job.JobService
import android.util.Log

class MyService2 :JobService() {
    override fun onStartJob(params: JobParameters?): Boolean {
        Log.d("@@@@", "onStartJob: Job Started")
        return true
    }

    override fun onStopJob(params: JobParameters?): Boolean {
        Log.d("@@@@", "onStopJob: Job Stopped ")
        return true
    }


}