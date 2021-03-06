package com.github.rubensousa.workkitkatbug

import android.content.Context
import android.util.Log
import androidx.work.Worker
import androidx.work.WorkerParameters

class TestWorkerD(context: Context, params: WorkerParameters) : Worker(context, params) {

    override fun doWork(): Result {
        Thread.sleep(300)
        Log.d(this::class.java.simpleName, "I did some work")
        return Result.success()
    }


}