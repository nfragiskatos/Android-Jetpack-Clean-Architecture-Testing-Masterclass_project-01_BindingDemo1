package com.nfragiskatos.bindingdemo1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.nfragiskatos.bindingdemo1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val students: MutableList<Student> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initData()

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.submitButton.setOnClickListener {
            binding.student = students.random()
        }
    }

    private fun initData() {
        students.add(Student(1, "Bruce Wayne", "batman@batcave.com"))
        students.add(Student(2, "Clark Kent", "superman@justiceleague.com"))
        students.add(Student(3, "Wayne Brady", "waynebrady@whoseline.com"))
        students.add(Student(4, "Barry Allen", "flash@justiceleague.com"))
        students.add(Student(5, "Tony Start", "ironman@avengers.com"))
        students.add(Student(6, "Bruce Banner", "hulk@avengers.com"))
        students.add(Student(7, "Thor", "thor@avengers.com"))
        students.add(Student(8, "Carol Danvers", "captainmarvel@avengers.com"))
        students.add(Student(9, "Peter Parker", "spiderman@avengers.com"))
        students.add(Student(10, "Stanley Tucci", "stanleytucci@prada.com"))
    }
}
