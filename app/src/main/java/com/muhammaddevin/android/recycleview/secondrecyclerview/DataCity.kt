package com.muhammaddevin.android.recycleview.secondrecyclerview

import com.muhammaddevin.android.recycleview.secondrecyclerview.DataCity.nameCity

object DataCity {
    private val nameCity: Array<String> = arrayOf(
        "name",
        "city",
        "depin"
    )

    private val image: Array<String> = arrayOf(
        "https://img.idxchannel.com/images/idx/2021/10/02/jakarta.jpg",
        "https://cdns.klimg.com/dream.co.id/resources/news/2019/09/04/116540/664xauto-6-destinasi-wisata-surabaya-kota-tersibuk-kedua-di-indonesia-190904q.jpg",
        "https://ik.imagekit.io/tvlk/image/imageResource/2019/05/18/1558208793111-0dac6e323d5a491c72604ed7108a57f1.jpeg?tr=q-70"
    )

    val listCity: ArrayList<City>
    get() {
        val list = arrayListOf<City>()
        for (position in nameCity.indices) {
            var City = City(
                nameCity = nameCity[position],
                image = image[position]
            )
            list.add(City)
        }
        return list
    }
}