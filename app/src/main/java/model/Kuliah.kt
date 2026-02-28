package com.PrakTAM2_2457051016.model

import androidx.annotation.DrawableRes

data class Kuliah(
    val nama: String,
    val deskripsi: String,
    val harga: Int,
    @DrawableRes val imageRes: Int
)