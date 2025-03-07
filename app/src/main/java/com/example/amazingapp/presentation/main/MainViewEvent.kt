package com.example.amazingapp.presentation.main

import com.example.amazingapp.domain.LocationModel
import com.example.amazingapp.domain.NewModel

sealed class MainViewEvent {
    class OnDataNewSuccess(val news: List<NewModel>) : MainViewEvent()

    class OnDataLocationSuccess(val locations: List<LocationModel>) : MainViewEvent()

    class OnError(val message: String) : MainViewEvent()
}