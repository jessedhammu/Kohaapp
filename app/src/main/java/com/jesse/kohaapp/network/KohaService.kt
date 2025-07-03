package com.jesse.kohaapp.network

import com.jesse.kohaapp.models.Book
import com.jesse.kohaapp.models.User
import retrofit2.Call
import retrofit2.http.*

interface KohaService {

    // Search by keyword (check your Koha endpoint pattern)
    @GET("search")
    fun searchBooks(@Query("q") keyword: String): Call<List<Book>>

    // Profile (requires Basic Auth)
    @GET("profile")
    fun getProfile(@Header("Authorization") auth: String): Call<User>
}