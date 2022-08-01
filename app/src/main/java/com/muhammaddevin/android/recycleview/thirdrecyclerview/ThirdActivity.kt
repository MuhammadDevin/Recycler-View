package com.muhammaddevin.android.recycleview.thirdrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.muhammaddevin.android.recycleview.R
import com.muhammaddevin.android.recycleview.databinding.ActivityThirdBinding
import org.json.JSONArray
import org.json.JSONException
import org.json.JSONObject
import java.io.IOException
import java.nio.charset.StandardCharsets

class ThirdActivity : AppCompatActivity() {

    private var modelPahlawan: MutableList<ModelPahlawan> = ArrayList()
    lateinit var pahlawanAdapter: PahlawanAdapter

    private lateinit var binding: ActivityThirdBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThirdBinding.inflate(layoutInflater)
        setContentView(binding.root)

        getListPahlawan()

        binding.rvListPahlawan.apply {
            layoutManager = LinearLayoutManager(this@ThirdActivity)
        }
    }

    fun getListPahlawan(){
        try {
            // untuk proses membuka asset json
            val stream = assets.open("pahlawan_nasional.json")
            val size = stream.available()
            val buffer = ByteArray(size)
            stream.read(buffer)
            stream.close()
            val strContent = String(buffer, StandardCharsets.UTF_8)
            try {
              val jsonObject = JSONObject(strContent)
              val jsonArray = jsonObject.getJSONArray("daftar_pahlawan")
                for (i in 0 until jsonArray.length()){
                    val jsonObjectData = jsonArray.getJSONObject(i)
                    val dataApi = ModelPahlawan()
                    dataApi.nama = jsonObjectData.getString("nama")
                    dataApi.namaLengkap = jsonObjectData.getString("nama2")
                    dataApi.image = jsonObjectData.getString("img")
                    modelPahlawan.add(dataApi)
                }
                pahlawanAdapter = PahlawanAdapter(modelPahlawan)
                // set up recycler view
                binding.rvListPahlawan.adapter = pahlawanAdapter
            } catch (e : JSONException){
                e.printStackTrace()
            }

        } catch (e : IOException){
            Toast.makeText(applicationContext, "ERROR", Toast.LENGTH_SHORT).show()

        }
    }
}