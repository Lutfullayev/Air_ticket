package com.example.air_ticket

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.air_ticket.databinding.ActivityMainBinding
import com.google.android.material.progressindicator.BaseProgressIndicator
import kotlin.random.Random


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.Button.setOnClickListener() {
            val from = binding.range.values[0]
            val to = binding.range.values[1]

            if (binding.chec.isChecked) {
                val randomnumber = Random.nextInt(from.toInt(), to.toInt())
                binding.textview.text = "generate : $randomnumber"

            } else {

                val randomnumber = Random.nextDouble(from.toDouble(), to.toDouble())
                binding.textview.text = "generate : $randomnumber"
            }

        }
    }
}