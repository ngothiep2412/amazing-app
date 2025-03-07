package com.example.amazingapp.di

import android.app.Application
import com.example.amazingapp.AmazingApp
import com.example.amazingapp.base.CoroutineDispatchers
import com.example.amazingapp.presentation.main.MainViewModel
import kotlinx.coroutines.Dispatchers
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module


val appModule = module {
    single {
        CoroutineDispatchers(
            main = Dispatchers.Main,
            mainImmediate = Dispatchers.Main.immediate,
            io = Dispatchers.IO,
            default = Dispatchers.Default
        )
    }
    single<AmazingApp> { AmazingApp() }
    viewModel { MainViewModel(get()) }
}