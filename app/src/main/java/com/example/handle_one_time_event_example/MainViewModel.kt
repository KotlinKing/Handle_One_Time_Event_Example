package com.example.handle_one_time_event_example

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.channels.consumeEach
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {

    sealed class MyEvent {
        data class ErrorEvent(val message: String): MyEvent()
    }

    private val eventChannel = Channel<MyEvent>()
    val eventFlow = eventChannel.receiveAsFlow()

    fun triggerEvent() = viewModelScope.launch {
        eventChannel.send(MyEvent.ErrorEvent("This is a toast message!"))
    }
}























