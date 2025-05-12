package com.example.readerapp.screens.details

import androidx.lifecycle.ViewModel
import com.example.readerapp.repository.BookRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import jakarta.inject.Inject

@HiltViewModel
class DetailsViewModel @Inject constructor(private val repository: BookRepository) : ViewModel(){
    suspend fun getBookInfo(bookId: String): Resource<Item> {
        return repository.getBookInfo(bookId)
    }
}