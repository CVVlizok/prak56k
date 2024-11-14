package com.example.prak56k

import retrofit2.Call
import retrofit2.http.GET

interface RetrofitAPI {
    @GET("d286-4953-47fe-830d")
    fun getAllFilms(): Call<ArrayList<Film>>
}