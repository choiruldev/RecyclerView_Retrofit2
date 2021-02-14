package com.chrl.retrofit2.network

import retrofit2.Call
import com.chrl.retrofit2.api.RecyclerList
import retrofit2.http.GET
import retrofit2.http.Query

interface RetroService {

    @GET("repositories")
    fun getDataFromAPI(@Query("q") query: String): Call<RecyclerList>
}