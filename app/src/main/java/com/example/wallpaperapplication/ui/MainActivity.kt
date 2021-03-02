package com.example.wallpaperapplication.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.wallpaperapplication.adapter.CategoryAdapter
import com.example.wallpaperapplication.databinding.ActivityMainBinding
import com.example.wallpaperapplication.model.CategoryModel
import com.example.wallpaperapplication.util.MockData
import java.util.ArrayList

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val adapter = CategoryAdapter(MockData.getMockedCategory() as ArrayList<CategoryModel>)
        binding.recyclerCategory.adapter = adapter
    }
}