package com.example.readerapp.repository

import com.example.readerapp.model.İtem
import com.example.readerapp.network.BooksApi
import javax.inject.Inject
import com.example.readerapp.data.Resource

class BookRepository @Inject constructor(private val api: BooksApi) {
    suspend fun getBooks(searchQuery: String): Resource<List<İtem>>{

        return try {
            Resource.Loading(data = true)

            val itemList = api.getAllBooks(searchQuery).items
            if (itemList.isNotEmpty()) Resource.Loading(data = false)
            Resource.Success(data = itemList)

        }catch (exception: Exception) {
            Resource.Error(message = exception.message.toString())
        }

    }

    suspend fun getBookInfo(bookId: String): Resource<İtem> {
        val response = try {
            Resource.Loading(data = true)
            api.getBookInfo(bookId)

        }catch (exception: Exception){
            return Resource.Error(message = "An error occurred ${exception.message.toString()}")
        }
        Resource.Loading(data = false)
        return Resource.Success(data = response)
    }


}