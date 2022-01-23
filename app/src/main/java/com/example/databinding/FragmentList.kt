package com.example.databinding

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.databinding.databinding.FragmentListBinding
import com.example.databinding.models.FragmentEmployee

class FragmentList : Fragment() {
    private lateinit var binding: FragmentListBinding
    private lateinit var list: List<FragmentEmployee>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_list, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val layoutManager = LinearLayoutManager(view.context)

        binding.list.layoutManager = layoutManager
        list = listOf(
            FragmentEmployee(
                "1",
                image = "https://c-cl.cdn.smule.com/rs-s79/arr/b0/9d/5b7f64bb-45c8-4708-a7fc-9709968526ea.jpg"
            ),
            FragmentEmployee(
                "2",
                image = "https://c-cl.cdn.smule.com/rs-s79/arr/b0/9d/5b7f64bb-45c8-4708-a7fc-9709968526ea.jpg"
            ),
            FragmentEmployee(
                "3",
                image = "https://c-cl.cdn.smule.com/rs-s79/arr/b0/9d/5b7f64bb-45c8-4708-a7fc-9709968526ea.jpg"
            ),
            FragmentEmployee(
                "4",
                image = "https://c-cl.cdn.smule.com/rs-s79/arr/b0/9d/5b7f64bb-45c8-4708-a7fc-9709968526ea.jpg"
            ),
            FragmentEmployee(
                "5",
                image = "https://c-cl.cdn.smule.com/rs-s79/arr/b0/9d/5b7f64bb-45c8-4708-a7fc-9709968526ea.jpg"
            ),
            FragmentEmployee(
                "6",
                image = "https://c-cl.cdn.smule.com/rs-s79/arr/b0/9d/5b7f64bb-45c8-4708-a7fc-9709968526ea.jpg"
            ),
            FragmentEmployee(
                "7",
                image = "https://c-cl.cdn.smule.com/rs-s79/arr/b0/9d/5b7f64bb-45c8-4708-a7fc-9709968526ea.jpg"
            )
        )
        binding.list.adapter = EmployeeAdapter(list)
    }
}