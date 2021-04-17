package com.nfragiskatos.bindingdemo1

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel(startingTotal: Int) : ViewModel() {
    private var _total = MutableLiveData<Int>()

    val total: LiveData<Int> = _total
    val text = MutableLiveData<String>()
    val addend = MutableLiveData<String>()

    init {
        _total.value = startingTotal
        text.value = "Sam"
    }

    fun addToTotal() {
        val input = addend.value?.trim()
        if (!input.isNullOrEmpty()) _total.value = _total.value?.plus(input.toInt())
    }
}