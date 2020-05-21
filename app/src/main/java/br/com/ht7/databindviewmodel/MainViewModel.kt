package br.com.ht7.databindviewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    private var number = 0

    private val _counter: MutableLiveData<String> = MutableLiveData("0")

    val counter: LiveData<String>
        get() = _counter

    fun count() {
        _counter.value = (++number).toString()
    }
}