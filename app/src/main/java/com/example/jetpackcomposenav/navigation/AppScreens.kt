package com.example.jetpackcomposenav.navigation

sealed class AppScreens(val route: String){

    object FirstScreen: AppScreens("first_screen")
    object SecondtScreen: AppScreens("second_screen")

}
