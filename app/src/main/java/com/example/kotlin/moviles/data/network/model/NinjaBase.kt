package com.example.kotlin.moviles.data.network.model

import com.google.gson.annotations.SerializedName

class NinjaBase {
    @SerializedName("expire") val expire: Int? = null
    @SerializedName("flags") val flags: Int? = null
    @SerializedName("mname") val mname: String? = null
    @SerializedName("record_type") val record_type: String = "defaultType"
    @SerializedName("refresh") val refresh: Int? = null
    @SerializedName("retry") val retry: Int? = null
    @SerializedName("rname") val rname: String? = null
    @SerializedName("serial") val serial: Int? = null
    @SerializedName("tag") val tag: String? = null
    @SerializedName("ttl") val ttl: Int? = null
    @SerializedName("value") val value: String = "defaultValue"
}
