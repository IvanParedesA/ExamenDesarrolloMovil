package com.example.kotlin.moviles.domain

import com.example.kotlin.moviles.data.NinjaRepository
import com.example.kotlin.moviles.data.network.model.NinjaBase

class NinjaListRequirement {
    private val repository = NinjaRepository()

    suspend operator fun invoke(
        limit:Int
    ): NinjaBase? = repository.getNinjaList(limit)
}