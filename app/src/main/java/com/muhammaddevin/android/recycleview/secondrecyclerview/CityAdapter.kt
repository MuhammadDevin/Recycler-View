package com.muhammaddevin.android.recycleview.secondrecyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.muhammaddevin.android.recycleview.databinding.CityItemBinding


class CityAdapter(private val listCity: ArrayList<City>): RecyclerView.Adapter<CityAdapter.MyViewHolder>(){

    inner class MyViewHolder (val itemBinding: CityItemBinding): RecyclerView.ViewHolder(itemBinding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = MyViewHolder (
        CityItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.itemBinding.apply {
            with(listCity[position]){
                cityItem.text = nameCity
                Glide.with(imgItem.context).load(image).into(imgItem)

            }
        }
    }

    override fun getItemCount(): Int = listCity.size

}