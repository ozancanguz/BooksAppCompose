package com.example.booksappcompose.data.remote

import com.example.booksappcompose.data.Book
import com.example.booksappcompose.data.BookList
import com.example.booksappcompose.data.api.BooksApi
import retrofit2.Response
import javax.inject.Inject

class Remote@Inject constructor(private val booksApi: BooksApi ) {


    suspend fun getBooks(): Response<BookList>{
        return booksApi.getBooks()
    }



}