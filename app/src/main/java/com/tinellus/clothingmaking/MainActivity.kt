package com.tinellus.clothingmaking

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.tinellus.clothingmaking.ui.theme.ClothingMakingTheme
import com.tinellus.clothingmaking.view.MyMainView
import com.tinellus.clothingmaking.view.SalvarTarefas

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ClothingMakingTheme {
                val navController = rememberNavController()

                NavHost(navController = navController, startDestination = "myMainView"){
                    composable(
                        route = "myMainView"
                    ){
                        MyMainView(navController)
                    }
                    composable(
                        route = "salvarTarefas"
                    ){
                        SalvarTarefas(navController)
                    }

                }
            }
        }
    }


}



