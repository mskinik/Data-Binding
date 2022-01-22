package com.example.databinding

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.databinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var mainBinding: ActivityMainBinding
    private lateinit var employee: Employee
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mainBinding.root)
        //or
        //mainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        employee = Employee("Süleyman","Kınık","Android Dev",5,"https://bogazda.org/blog/wp-content/uploads/2020/12/istanbulbogazi-1024x556.jpg")
        mainBinding.emp = employee
        mainBinding.button.setOnClickListener {
            mainBinding.ivPhoto.setPhotoFromUrl("https://aux2.iconspalace.com/uploads/search-icon-256-862029948.png")
        }
    }
}