package com.example.wallpaperapplication.util

import com.example.wallpaperapplication.R
import com.example.wallpaperapplication.model.CategoryModel

object MockData {

    fun getMockedCategory(): List<CategoryModel> {
        val itemModel1 = CategoryModel(
            R.drawable.step_one_1,
            "FACEBOOK"
        )
        val itemModel2 = CategoryModel(
            R.drawable.step_one_2,
            "INSTAGRAM"
        )
        val itemModel3 = CategoryModel(
            R.drawable.step_one_3,
            "WHATSAPP"
        )
        val itemModel4 = CategoryModel(
            R.drawable.step_one_4,
            "YOUTUBE"
        )
        val itemModel5 = CategoryModel(
            R.drawable.step_one_5,
            "TWITTER"
        )
        val itemModel6 = CategoryModel(
            R.drawable.step_one_6,
            "LINKEDIN"
        )
        val itemModel7 = CategoryModel(
            R.drawable.step_one_7,
            "SNAPCHAT"
        )
        val itemModel8 = CategoryModel(
            R.drawable.step_two_1,
            "SKYPE"
        )

        val itemList: ArrayList<CategoryModel> = ArrayList()
        itemList.add(itemModel1)
        itemList.add(itemModel2)
        itemList.add(itemModel3)
        itemList.add(itemModel4)
        itemList.add(itemModel5)
        itemList.add(itemModel6)
        itemList.add(itemModel7)
        itemList.add(itemModel8)
        return itemList
    }

}