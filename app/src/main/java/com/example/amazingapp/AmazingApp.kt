package com.example.amazingapp

import android.app.Application
import com.example.amazingapp.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import timber.log.Timber

class AmazingApp : Application() {

    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())

        startKoin{
            androidLogger()
            androidContext(this@AmazingApp)
            modules(appModule)
        }
    }
}