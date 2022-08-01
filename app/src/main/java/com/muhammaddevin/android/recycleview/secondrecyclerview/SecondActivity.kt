package com.muhammaddevin.android.recycleview.secondrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.muhammaddevin.android.recycleview.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rvCity.apply {
            adapter = CityAdapter(DataCity.listCity)
        }
    }
}