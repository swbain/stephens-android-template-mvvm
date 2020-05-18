package com.stephenbain.androidtemplate.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import javax.inject.Inject

class HomeViewModel @Inject constructor() : ViewModel() {
    private val _state = MutableLiveData<HomeState>()

    val state: LiveData<HomeState>
        get() = _state

    init {
        _state.value = HomeState("haha this is ur app lol")
    }
}

data class HomeState(val text: String)