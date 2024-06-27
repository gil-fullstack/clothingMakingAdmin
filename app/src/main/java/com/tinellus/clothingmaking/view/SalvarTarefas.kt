package com.tinellus.clothingmaking.view

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.tinellus.clothingmaking.R

@ExperimentalMaterial3Api
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun SalvarTarefas(
    navController: NavController
){
    Scaffold {
        TopAppBar(title = {
                Text(text = stringResource(id = R.string.app_name), color = Color.White)
            },
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = Color.Red
            ),
            navigationIcon = {
                IconButton(onClick = { navController.navigate("myMainView") }) {
                    Icon(imageVector = Icons.Default.Menu, contentDescription = "Toggle Drawer",
                        tint = Color.White
                    )
                }
            })
    }
}