package com.example.kotlin.moviles.data.network

import retrofit2.http.GET
import retrofit2.http.Query

interface NinjaAPIService {
    @GET("ninja")
    suspend fun getNinjaList(
        @Query("limit") limit:Int
    ): com.example.kotlin.moviles.data.network.model.NinjaBase

}