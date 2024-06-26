package com.example.kotlin.moviles.data.network.model.ninja

data class NinjaItem(
    val expire: Int,
    val flags: Int,
    val mname: String,
    val record_type: String,
    val refresh: Int,
    val retry: Int,
    val rname: String,
    val serial: Int,
    val tag: String,
    val ttl: Int,
    val value: String
)