package com.example.mvvmdemodataapplication.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitObject {


    private const val URL_CARD="https://dummyjson.com"
    fun getInstance():Retrofit{

        return Retrofit.Builder()
            .baseUrl(URL_CARD)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }



}