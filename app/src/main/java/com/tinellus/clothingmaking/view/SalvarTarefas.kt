package com.tinellus.clothingmaking.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun SalvarTarefas(
    navController: NavController
){
    Column(modifier = Modifier.fillMaxSize().background(Color.Cyan),
        verticalArrangement = Arrangement.Center,

        ) {

        Button(
            onClick = { navController.navigate("myMainView") },
            modifier = Modifier.align(Alignment.CenterHorizontally)

        ) {
            Text(text = "Go Back main", fontWeight = FontWeight.Bold)
        }
    }
}