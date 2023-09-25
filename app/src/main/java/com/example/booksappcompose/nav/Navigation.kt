package com.example.booksappcompose.nav

import androidx.compose.runtime.Composable
import androidx.navigation.Navigation
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.booksappcompose.view.DetailScreen
import com.example.booksappcompose.view.ListScreen

@Composable
fun Navigation() {


    //navcontroller
    val navController= rememberNavController()

    // navhost
    NavHost(navController =navController , startDestination =Screen.ListScreen.route ){

        composable(route=Screen.ListScreen.route){
            ListScreen(navController = navController)
            
        }


        composable(route=Screen.DetailScreen.route){
               DetailScreen(navController = navController)
            
            
        }



    }
}