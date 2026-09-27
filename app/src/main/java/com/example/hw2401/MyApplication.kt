package com.example.hw2401
import android.app.Application
import android.util.Log
import timber.log.Timber

class MyApplication : android.app.Application() {
    var startCount = 0

    override fun onCreate() {
        super.onCreate()

        Log.d("MyApplication", "Застосунок стартував! Тут можна ініціалізувати бібліотеки.")

        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        }
    }
}