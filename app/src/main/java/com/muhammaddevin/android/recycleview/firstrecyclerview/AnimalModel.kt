package com.muhammaddevin.android.recycleview.firstrecyclerview

import android.content.Context
import com.muhammaddevin.android.recycleview.R

class AnimalModel(val context: Context) {
    fun getAnimalList(): Array<String>{
        return context.resources.getStringArray(R.array.animalList)
    }
}