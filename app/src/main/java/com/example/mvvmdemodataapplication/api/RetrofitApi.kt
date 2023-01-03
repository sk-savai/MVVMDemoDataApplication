package com.example.mvvmdemodataapplication.api

import com.example.mvvmdemodataapplication.model.CardList
import retrofit2.Response
import retrofit2.http.GET

interface RetrofitApi {

    @GET("/carts")
    suspend fun getCard():Response<CardList>
}