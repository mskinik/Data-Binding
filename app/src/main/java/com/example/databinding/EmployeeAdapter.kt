package com.example.databinding
import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.databinding.databinding.AdapterLayoutBinding
import com.example.databinding.models.FragmentEmployee

/**
 * Created by mustafasuleymankinik on 23.01.2022
 */
class EmployeeAdapter(val list:List<FragmentEmployee>): RecyclerView.Adapter<EmployeeAdapter.EmployeeAdapterViewHolder>() {

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): EmployeeAdapterViewHolder {
       val binding = DataBindingUtil.inflate<AdapterLayoutBinding>(LayoutInflater.from(p0.context),R.layout.adapter_layout,p0,false)
        return EmployeeAdapterViewHolder(binding)
    }

    override fun onBindViewHolder(p0: EmployeeAdapterViewHolder, p1: Int) {
        val binding = p0.binding
        binding.apply {
            with(list[p1])
            {
                tvName.text = this.name
                ivPhoto.setPhotoFromUrl(this.image)
            }
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }
    class EmployeeAdapterViewHolder(val binding: AdapterLayoutBinding):RecyclerView.ViewHolder(binding.root) {

    }
}