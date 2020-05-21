package br.com.ht7.databindviewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    private val _counter = MutableLiveData<Int>()

    val counter: LiveData<Int>
        get() = _counter

    init {
        _counter.value = 1
    }

    fun count() {
        _counter.value = _counter.value?.plus(1)
    }
}