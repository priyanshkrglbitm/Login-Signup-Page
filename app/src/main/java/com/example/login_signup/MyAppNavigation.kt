package com.example.login_signup

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.login_signup.pages.HomePage
import com.example.login_signup.pages.LoginPage
import com.example.login_signup.pages.SignupPage
import com.example.login_signup.AuthViewModel

@Composable
fun MyAppNavigation(modifier : Modifier =Modifier, authViewModel: AuthViewModel){
    val navController = rememberNavController()

    NavHost(navController =navController, startDestination ="login",builder={
        composable("login"){
            LoginPage(modifier,navController,authViewModel)
        }
        composable("signup"){
            SignupPage(modifier,navController,authViewModel)
        }
        composable("home"){
            HomePage(modifier, navController, authViewModel)
        }

    } )
}