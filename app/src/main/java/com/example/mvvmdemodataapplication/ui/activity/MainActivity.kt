package com.example.mvvmdemodataapplication.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import com.example.mvvmdemodataapplication.R
import com.example.mvvmdemodataapplication.api.RetrofitApi
import com.example.mvvmdemodataapplication.api.RetrofitObject
import com.example.mvvmdemodataapplication.repository.CardRepository
import com.example.mvvmdemodataapplication.viewmodel.CardViewModel
import com.example.mvvmdemodataapplication.viewmodelfactory.CardViewModelFactory

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }
}