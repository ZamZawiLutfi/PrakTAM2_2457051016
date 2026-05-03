package com.example.praktam2_2457051016.model

import com.google.gson.annotations.SerializedName

data class Kuliah(
    @SerializedName("nama")
    val nama: String,
    @SerializedName("deskripsi")
    val deskripsi: String,
    @SerializedName("harga")
    val harga: Int,
    @SerializedName("image_url")
    val imageUrl: String
)