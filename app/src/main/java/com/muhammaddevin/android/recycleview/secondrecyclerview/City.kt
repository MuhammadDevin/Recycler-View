package com.muhammaddevin.android.recycleview.secondrecyclerview

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class City(
    var nameCity : String,
    var image : String
): Parcelable
