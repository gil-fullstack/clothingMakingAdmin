package com.tinellus.clothingmaking.view

import androidx.compose.foundation.layout.*

import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import android.util.Log




@Composable
fun LoginScreen(
    navController: NavController
) {
    var username by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        OutlinedTextField(
            value = username,
            onValueChange = { username = it },
            label = { Text("Login") },
            singleLine = true,
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            label = { Text("Senha") },
            singleLine = true,
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = {
                Log.d("DEBUGGING", password)
                if(password == "1234") {
                    Log.d("DEBUGGING 1234", password)
                    navController.navigate("myMainView")                }else if(password == "gilvan"){
                    Log.d("DEBUGGING 1234", password)
                    navController.navigate("salvarTarefas")
                }

            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("ENTRAR", fontWeight = FontWeight.Bold)
        }
    }
}

//@Preview
//@Composable
//fun LoginScreenPreview() {
//    MaterialTheme {
//        LoginScreen()
//    }
//}