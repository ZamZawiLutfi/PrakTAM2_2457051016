package com.example.praktam2_2457051016.network

import com.example.praktam2_2457051016.model.Kuliah
import retrofit2.http.GET

interface ApiService {
    @GET("kuliah.json")
    suspend fun getKuliah(): List<Kuliah>
}