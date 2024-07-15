package com.tinellus.clothingmaking.view

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.tinellus.clothingmaking.R
import com.tinellus.clothingmaking.components.CaixaDeTexto

@ExperimentalMaterial3Api
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun SalvarTarefas(
    navController: NavController
) {
    var expanded by remember { mutableStateOf(false) }
    Scaffold(
        topBar = {
            TopAppBar(title = {
                Text(text = stringResource(id = R.string.app_name), color = Color.White)
            },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color.Red
                ),
                navigationIcon = {
                    IconButton(onClick = {
                        expanded = !expanded
                    }) {
                        Icon(
                            imageVector = Icons.Default.Menu, contentDescription = "Toggle Drawer",
                            tint = Color.White
                        )
                        DropdownMenu(
                            expanded = expanded,
                            onDismissRequest = { expanded = false },
                            modifier = Modifier
                                .fillMaxWidth()
                                .background(Color.White)
                        ) {
                            DropdownMenuItem(text = {
                                Text(
                                    text = "Salvar Tarefas",
                                    color = Color.White,
                                    fontWeight = FontWeight.Bold,
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .background(Color.Red)
                                        .padding(7.dp),
                                    fontSize = 20.sp
                                )
                            },
                                onClick = {
                                    expanded = false
                                    navController.navigate("salvarTarefas")
                                })
                            DropdownMenuItem(text = {
                                Text(
                                    text = "PRINCIPAL",
                                    color = Color.White,
                                    fontWeight = FontWeight.Bold,
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .background(Color.Red)
                                        .padding(7.dp),
                                    fontSize = 20.sp
                                )
                            },
                                onClick = {
                                    expanded = false
                                    navController.navigate("myMainView")
                                })
                            DropdownMenuItem(text = {
                                Text(
                                    text = "Voltar Login",
                                    color = Color.White,
                                    fontWeight = FontWeight.Bold,
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .background(Color.Red)
                                        .padding(7.dp),
                                    fontSize = 20.sp
                                )
                            },
                                onClick = {
                                    expanded = false
                                    navController.navigate("loginScreen")
                                })
                        }
                    }

                })
        }
    ) {
        var tituloTarefa by remember {
            mutableStateOf("")
        }
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
        ) {
            Spacer(modifier = Modifier.height(120.dp))
            Text(text = "Teste Texto")
            CaixaDeTexto(
                value = tituloTarefa,
                onValueChange = {
                    tituloTarefa = it
                },
                modifier = Modifier
                    .padding(20.dp, 20.dp, 20.dp, 0.dp),
                label = "Título tarefa",
                maxLines = 1,
                keyboardType = KeyboardType.Text
            )
        }
    }
}