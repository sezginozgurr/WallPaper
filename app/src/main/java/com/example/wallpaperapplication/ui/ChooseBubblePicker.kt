package com.example.wallpaperapplication.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.example.wallpaperapplication.R
import com.example.wallpaperapplication.databinding.ActivityChooseBubblePickerBinding
import com.igalata.bubblepicker.BubblePickerListener
import com.igalata.bubblepicker.adapter.BubblePickerAdapter
import com.igalata.bubblepicker.model.BubbleGradient
import com.igalata.bubblepicker.model.PickerItem

class ChooseBubblePicker : AppCompatActivity() {

    lateinit var binding: ActivityChooseBubblePickerBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityChooseBubblePickerBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val titles = resources.getStringArray(R.array.countries)
        val colors = resources.obtainTypedArray(R.array.colors)
        val images = resources.obtainTypedArray(R.array.images)

        binding.picker.adapter = object : BubblePickerAdapter {

            override val totalCount = titles.size
            override fun getItem(position: Int): PickerItem {
                return PickerItem().apply {
                    title = titles[position]
                    gradient = BubbleGradient(
                        colors.getColor((position * 2) % 8, 0),
                        colors.getColor((position * 2) % 8 + 1, 0), BubbleGradient.VERTICAL
                    )
                    textColor =
                        ContextCompat.getColor(this@ChooseBubblePicker, android.R.color.white)
                    backgroundImage = ContextCompat.getDrawable(
                        this@ChooseBubblePicker,
                        images.getResourceId(position, 0)
                    )
                }
            }

        }

        //colors.recycle()
        images.recycle()

        binding.picker.bubbleSize = 5
        binding.picker.listener = object : BubblePickerListener {
            override fun onBubbleSelected(item: PickerItem) {
                toast("${item.title} selected")
            }

            override fun onBubbleDeselected(item: PickerItem) {
                toast("${item.title} deselected")
            }
        }
    }

    override fun onResume() {
        super.onResume()
        binding.picker.onResume()
    }

    override fun onPause() {
        super.onPause()
        binding.picker.onPause()
    }

    private fun toast(text: String) = Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
}