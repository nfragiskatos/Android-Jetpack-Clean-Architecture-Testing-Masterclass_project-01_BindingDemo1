package com.nfragiskatos.bindingdemo1

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel(startingTotal: Int) : ViewModel() {
    private var _total = MutableLiveData<Int>()
    val total : LiveData<Int> = _total

    init {
        _total.value = startingTotal
    }

    fun addToTotal(addend: Int) {
        _total.value = _total.value?.plus(addend)
    }
}