package com.example.wallpaperapplication.holder

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.RecyclerView
import com.example.wallpaperapplication.R
import com.example.wallpaperapplication.model.CategoryModel

class CategoryHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    fun bind(categoryModel: CategoryModel) {
        val image = itemView.findViewById(R.id.image) as ImageView
        val title = itemView.findViewById(R.id.title) as AppCompatTextView

        title.text = categoryModel.title
        image.setImageResource(categoryModel.image)
    }
}