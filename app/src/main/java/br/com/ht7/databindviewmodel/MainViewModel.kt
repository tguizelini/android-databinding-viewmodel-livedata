package br.com.ht7.databindviewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    private var number = 1

    private val _counter = MutableLiveData<String>()

    val counter: LiveData<String>
        get() = _counter

    init {
        _counter.value = number.toString()
    }

    fun count() {
        _counter.value = (++number).toString()
    }
}