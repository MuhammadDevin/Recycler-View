package com.muhammaddevin.android.recycleview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.muhammaddevin.android.recycleview.databinding.ActivityMainBinding
import com.muhammaddevin.android.recycleview.firstrecyclerview.FirstActivity
import com.muhammaddevin.android.recycleview.secondrecyclerview.SecondActivity
import com.muhammaddevin.android.recycleview.thirdrecyclerview.ThirdActivity

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.firstRecycleView.setOnClickListener {
            val intent = Intent(this, FirstActivity::class.java)
            startActivity(intent)

            }

        binding.secondRecycleView.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)


        }

        binding.thirdRecycleView.setOnClickListener {
            val intent = Intent(this, ThirdActivity::class.java)
            startActivity(intent)


        }

    }
}