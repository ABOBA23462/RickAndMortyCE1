package com.example.rickandmortyce.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.rickandmortyce.R
import com.example.rickandmortyce.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}