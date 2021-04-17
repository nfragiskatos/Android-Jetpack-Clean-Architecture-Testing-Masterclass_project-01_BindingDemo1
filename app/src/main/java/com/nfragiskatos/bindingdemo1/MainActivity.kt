package com.nfragiskatos.bindingdemo1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.nfragiskatos.bindingdemo1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val students: MutableList<Student> = ArrayList()
    private lateinit var viewModel: MainActivityViewModel
    private lateinit var viewModelFactory: MainActivityViewModelFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModelFactory = MainActivityViewModelFactory(175)
        viewModel = ViewModelProvider(this, viewModelFactory).get(MainActivityViewModel::class.java)
        binding.lifecycleOwner = this
        binding.viewModel = viewModel

        binding.submitButton.setOnClickListener {
            viewModel.addToTotal(getAddend())
        }
    }

    private fun getAddend(): Int {
        val input = binding.addEditText.text.toString().trim()
        return if (input.isNullOrEmpty()) 0 else input.toInt()
    }
}
