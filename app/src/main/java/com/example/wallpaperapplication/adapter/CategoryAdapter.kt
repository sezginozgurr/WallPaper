package com.example.wallpaperapplication.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.wallpaperapplication.R
import com.example.wallpaperapplication.holder.CategoryHolder
import com.example.wallpaperapplication.model.CategoryModel
import java.util.ArrayList

class CategoryAdapter(val categoryList: ArrayList<CategoryModel>) :
    RecyclerView.Adapter<CategoryHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryHolder {
        return CategoryHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.row_item_category, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return categoryList.size
    }

    override fun onBindViewHolder(holder: CategoryHolder, position: Int) {
        holder.bind(categoryList[position])
    }

}