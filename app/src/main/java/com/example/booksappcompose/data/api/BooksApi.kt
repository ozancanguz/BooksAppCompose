package com.example.booksappcompose.data.api

import com.example.booksappcompose.data.Book
import com.example.booksappcompose.data.BookList
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Headers

interface BooksApi {

    @GET("newBook")
    @Headers("authorization: apikey 2xAW88zA1iemGAxzWMNumI:47IyS3uICCasjqzWaFtxnn", "content-type: application/json")
    suspend fun getBooks(): Response<BookList>



}