package com.jt17.restapi.model

import com.jt17.recyc3.ApiService.Api
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object NetManager {
    var retrofit: Retrofit? = null
    var api: Api? = null

    fun getApiService(): Api {
        if (api == null) {
            retrofit = Retrofit.Builder()
                .baseUrl("https://reqres.in/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
            api = retrofit!!.create(Api::class.java)
        }
        return api!!
    }
}