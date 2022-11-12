package com.jt17.recyc3.ApiService

import com.jt17.restapi.model.ApiModel
import com.jt17.restapi.model.DataModel
import retrofit2.Call
import retrofit2.http.GET

interface Api {
    @GET("api/users?page=2")
    fun getCourse(): Call<ApiModel<List<DataModel>>>


}