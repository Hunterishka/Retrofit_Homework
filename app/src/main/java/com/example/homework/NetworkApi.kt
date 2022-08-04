package com.example.homework

import com.example.homework.model.UserItem
import retrofit2.Call
import retrofit2.http.GET

interface NetworkApi {
    @GET("users")
    fun getUsers():Call<List<UserItem>>

}