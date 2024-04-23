package com.example.kotlin.moviles.data.network

class NinjaApiClient {
    private lateinit var api: NinjaAPIService

    suspend fun getPokemonList(limit:Int): com.example.kotlin.moviles.data.network.model.NinjaBase?{
        api = NetworkModuleDI()
        return try{
            api.getNinjaList(limit)
        }catch (e:java.lang.Exception){
            e.printStackTrace()
            null
        }
    }
}
