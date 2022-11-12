package com.jt17.restapi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.jt17.restapi.model.ApiModel
import com.jt17.restapi.model.DataModel
import com.jt17.restapi.model.NetManager
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() , Callback<ApiModel<List<DataModel>>>{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        NetManager.getApiService().getCourse().enqueue(this)
    }

    override fun onResponse(
        call: Call<ApiModel<List<DataModel>>>,
        response: Response<ApiModel<List<DataModel>>>
    ) {
        if(response.isSuccessful){
            findViewById<TextView>(R.id.textId).text = response.body()!!.data.map { it.first_name }.joinToString("\n")
        }
    }

    override fun onFailure(call: Call<ApiModel<List<DataModel>>>, t: Throwable) {
        TODO("Not yet implemented")
    }
}