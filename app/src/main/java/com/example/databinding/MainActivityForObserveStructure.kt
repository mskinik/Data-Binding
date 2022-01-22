package com.example.databinding

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.databinding.databinding.ActivityMainForObserveStructureBinding

class MainActivityForObserveStructure : AppCompatActivity() {
    lateinit var binding: ActivityMainForObserveStructureBinding
    lateinit var employeeWithObservable: EmployeeWithObservable
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainForObserveStructureBinding.inflate(layoutInflater)
        setContentView(binding.root)
        employeeWithObservable = EmployeeWithObservable()
        employeeWithObservable.name.set("James")
        employeeWithObservable.surname.set("Hetfield")
        employeeWithObservable.degree.set(5)
        employeeWithObservable.title.set("Android D.")
        employeeWithObservable.image.set("https://i.pinimg.com/favicons/f14bf8748e37285d2a3936c5445cad436db8e7a475baa3034577f50e.jpg?1cf9242f04ddae423eaee9d76b9a840f")

        binding.empObs = employeeWithObservable
        binding.buttonObs.setOnClickListener {
            employeeWithObservable.name.set("Tobias")
            employeeWithObservable.surname.set("Forge")
            employeeWithObservable.degree.set(2)
            employeeWithObservable.title.set("Android D.")
            employeeWithObservable.image.set("https://c-cl.cdn.smule.com/rs-s79/arr/b0/9d/5b7f64bb-45c8-4708-a7fc-9709968526ea.jpg")

        }
    }
}