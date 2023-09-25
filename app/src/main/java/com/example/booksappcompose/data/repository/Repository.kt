package com.example.booksappcompose.data.repository

import com.example.booksappcompose.data.remote.Remote
import dagger.hilt.android.scopes.ViewModelScoped
import javax.inject.Inject

@ViewModelScoped
class Repository@Inject constructor(private val remotedataSource: Remote) {

    val remote=remotedataSource

}