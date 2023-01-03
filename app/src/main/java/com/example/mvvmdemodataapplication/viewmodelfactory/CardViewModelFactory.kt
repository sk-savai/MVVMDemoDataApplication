package com.example.mvvmdemodataapplication.viewmodelfactory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.mvvmdemodataapplication.repository.CardRepository
import com.example.mvvmdemodataapplication.viewmodel.CardViewModel

class CardViewModelFactory(private val cardRepository: CardRepository):ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return CardViewModel(cardRepository) as T
    }
}