package com.example.booksappcompose.view

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.example.booksappcompose.viewmodels.ListScreenViewModel

@Composable
fun ListScreen( navController: NavController) {


    // init viewmodel
      val listScreenViewModel:ListScreenViewModel= hiltViewModel()


    // collect state

    val bookList by listScreenViewModel.bookList.collectAsState()

     // call viewmodel

    listScreenViewModel.getBooks()
    
    
    BooksList(bookList = bookList.result)









}