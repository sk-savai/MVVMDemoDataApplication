package com.example.mvvmdemodataapplication.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mvvmdemodataapplication.model.CardList
import com.example.mvvmdemodataapplication.repository.CardRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class CardViewModel(private val cardRepository: CardRepository):ViewModel() {

    val liveData:LiveData<CardList>
    get() = cardRepository.liveData

    init {
        viewModelScope.launch(Dispatchers.IO) {
            cardRepository.getCard()
        }
    }


}