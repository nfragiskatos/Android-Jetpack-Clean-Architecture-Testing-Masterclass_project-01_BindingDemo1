package com.nfragiskatos.bindingdemo1

import androidx.lifecycle.ViewModel

class MainActivityViewModel(startingTotal: Int) : ViewModel() {
    private var total = 0;

    init {
        total = startingTotal
    }

    fun getCurrentTotal() : Int = total

    fun addToTotal(addend: Int) {
        total += addend
    }
}