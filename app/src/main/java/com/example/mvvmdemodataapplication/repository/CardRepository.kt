package com.example.mvvmdemodataapplication.repository

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.mvvmdemodataapplication.api.RetrofitApi
import com.example.mvvmdemodataapplication.model.CardList

class CardRepository(private val retrofitApi: RetrofitApi) {

    private val mutableLiveData=MutableLiveData<CardList>()
    val liveData:LiveData<CardList>
    get() = mutableLiveData


    suspend fun getCard(){

        val result=retrofitApi.getCard()

        if (result.body()!=null){
            mutableLiveData.postValue(result.body())
            Log.d("Card",result.body().toString())
        }

    }
}