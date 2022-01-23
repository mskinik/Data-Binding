package com.example.databinding

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.databinding.databinding.FragmentBlankBinding
import com.example.databinding.models.FragmentEmployee


class BlankFragment : Fragment() {
    private lateinit var binding: FragmentBlankBinding
    private lateinit var fragmentEmployee: FragmentEmployee
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_blank,container,false)
        val view = binding.root
        fragmentEmployee = FragmentEmployee("Dave","Mustain","Android .",5,"https://d3g9pb5nvr3u7.cloudfront.net/authors/574323be27bd279751f42942/341080682/256.jpg")
        binding.fEmp = fragmentEmployee
        return view
    }

}