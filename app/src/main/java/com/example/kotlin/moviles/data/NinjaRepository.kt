package com.example.kotlin.moviles.data

import com.example.kotlin.moviles.data.network.NinjaApiClient
import com.example.kotlin.moviles.data.network.model.NinjaBase

class NinjaRepository {

    private val apiNinja = NinjaApiClient()

    suspend fun getNinjaList(limit:Int): NinjaBase? = apiNinja.getNinjaList(limit)

}