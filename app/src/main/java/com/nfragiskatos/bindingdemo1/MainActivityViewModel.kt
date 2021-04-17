package com.nfragiskatos.bindingdemo1

import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {
    private var total = 0;

    fun getCurrentTotal() : Int = total

    fun addToTotal(addend: Int) {
        total += addend
    }
}