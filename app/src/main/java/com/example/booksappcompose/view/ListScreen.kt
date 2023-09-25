package com.example.booksappcompose.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.booksappcompose.nav.Screen

@Composable
fun ListScreen( navController: NavController) {


     Column(modifier = Modifier.fillMaxSize()) {

         Button(onClick = {

             navController.navigate(Screen.DetailScreen.route)



         }) {



         }
     }

}