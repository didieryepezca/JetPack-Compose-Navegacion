package com.example.jetpackcomposenav.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

import androidx.navigation.NavController


@Composable
fun SecondScreen(navController: NavController, texto: String?){
    Scaffold(topBar = {TopAppBar() {
                Icon(imageVector = Icons.Default.ArrowBack,
                    contentDescription = "Arrow Back",
                    modifier = Modifier.clickable {
                        navController.popBackStack()
                    })
                
                Spacer(modifier = Modifier.width(8.dp))
            
                Text(text = "Segunda pantalla")
                }
            })
    {
        SecondBodyContent(navController = navController, texto)
    }
}
@Composable
fun SecondBodyContent(navController: NavController, texto: String?){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement =  Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Hola Navegación")
        texto?.let { 
            Text(it)
        }
        
        Button(onClick = {
            navController.popBackStack()
        }) {
            Text(text = "Volver Atras")
        }
    }
}