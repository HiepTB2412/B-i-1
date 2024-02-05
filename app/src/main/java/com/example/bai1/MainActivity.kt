package com.example.bai1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.bai1.ui.theme.Bai1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainApp()
        }
    }
}

@Composable
fun MainApp() {
    val navController = rememberNavController()
    Bai1Theme {
        NavHost(navController = navController, startDestination = "newpassword") {
            composable("login") {
                LoginScreen(openForgotPassword = { navController.navigate("forgotpassword") })
            }

            composable("forgotpassword") {
                ForgotPasswordScreen()
            }

            composable("newpassword") {
                NewPasswordScreen()
            }
        }
    }
}