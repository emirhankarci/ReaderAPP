package com.example.readerapp.network

import android.content.ClipData
import com.example.readerapp.model.Book
import com.example.readerapp.model.İtem
import retrofit2.http.GET
import retrofit2.http.Path
import javax.inject.Singleton
import retrofit2.http.Query


@Singleton
interface BooksApi {
    @GET("volumes")
    suspend fun getAllBooks(@Query("q") query: String) : Book

    @GET("volumes/{bookId}")
    suspend fun getBookInfo(@Path("bookId") bookId: String) : İtem
}