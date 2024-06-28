package com.tinellus.clothingmaking.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.material3.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CaixaDeTexto(
    value: String,
    onValueChange: (String) -> Unit,
    modifier: Modifier,
    label: String,
    maxLines: Int,
    keyboardType: KeyboardType
){

   OutlinedTextField(
       value = value,
       onValueChange,
       modifier,
       label = {
           Text(text = label)
       },
       maxLines = maxLines,
       textStyle = TextStyle(color = Color.Gray, fontSize = 20.sp),

       colors = TextFieldDefaults.textFieldColors(
           disabledTextColor = Color.Gray,
           focusedIndicatorColor = Color.Blue,
           unfocusedIndicatorColor = Color.Gray,
           disabledIndicatorColor = Color.LightGray,
           cursorColor = Color.Green,
           errorCursorColor = Color.Magenta,
       ),
       shape = RoundedCornerShape(20.dp),
       keyboardOptions = KeyboardOptions(
           keyboardType = keyboardType
       )
   )
}

