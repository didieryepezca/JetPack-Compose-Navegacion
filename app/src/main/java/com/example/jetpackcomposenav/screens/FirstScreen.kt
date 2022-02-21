package com.example.jetpackcomposenav.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.jetpackcomposenav.navigation.AppScreens


@Composable
fun FirstScreen(navController: NavController){
    Scaffold(topBar = {
        TopAppBar() {
            Text(text = "Primera Pantalla")
                }
            })
    {
        BodyContent(navController = navController)
    }
}
@Composable
fun BodyContent(navController: NavController){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement =  Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Hola Navegación")
        Button(onClick = {
            navController.navigate(route = AppScreens.SecondtScreen.route + "/Este es un parametro")
        }) {
            Text(text = "Navega")
        }
    }
}

