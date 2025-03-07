package com.example.amazingapp.base

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

abstract class BaseViewModel<Event>(private val coroutineDispatchers: CoroutineDispatchers) :
    ViewModel() {
    private val _viewEvent = MutableLiveData<Event>()
    private val viewEvent = _viewEvent


    fun postValue(event: Event) {
        viewModelScope.launch(coroutineDispatchers.main) {
            _viewEvent.value = event
        }
    }
}