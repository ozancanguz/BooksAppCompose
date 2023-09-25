package com.example.booksappcompose.viewmodels

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.booksappcompose.data.Book
import com.example.booksappcompose.data.BookList
import com.example.booksappcompose.data.repository.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ListScreenViewModel@Inject constructor(private val repository: Repository): ViewModel() {


    private val _bookList = MutableStateFlow(BookList(emptyList(), false))
    val bookList:StateFlow<BookList>
        get() = _bookList



    fun getBooks(){
        viewModelScope.launch {
            val response=repository.remote.getBooks()
            if(response.isSuccessful){
                _bookList.value= response.body()!!
            }
            else{
                Log.d("viewmodel","no data")
            }
        }
    }





}