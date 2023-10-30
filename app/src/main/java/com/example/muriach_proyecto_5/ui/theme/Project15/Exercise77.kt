package com.example.muriach_proyecto_5.ui.theme.Project15

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController


/*
This program compare two word and show us if are equals or not
*/

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Exercise77(navController: NavController) {
    Text(
        text = "Welcome to: \n 'PROBLEM N.4'",
        textAlign = TextAlign.Center,
        style = TextStyle(
            fontSize = 30.sp
        ),
        color = Color.Gray,
        fontWeight = FontWeight.Bold,
        modifier = Modifier
            .fillMaxSize()
            .padding(vertical = 20.dp),
    )

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center
    ) {

        Row(Modifier.fillMaxWidth()) {
            Text(text = "",
                modifier = Modifier.padding(5.dp))
        }

        var inputStringA by remember { mutableStateOf("") }
        var inputStringB by remember { mutableStateOf("") }
        var textResult by remember { mutableStateOf("") }

        OutlinedTextField(
            value = inputStringA,
            onValueChange = { inputStringA = it },
            label = {
                Text("Introduce a word: ")
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            singleLine = true
        )

        OutlinedTextField(
            value = inputStringB,
            onValueChange = { inputStringB = it },
            label = {
                Text("Introduce a word: ")
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            singleLine = true
        )

        Button(
            onClick = {
                textResult = if (compareWords(inputStringA, inputStringB)) {
                    "The words are equals"
                } else {
                    "The words aren't equals"
                }
                inputStringA = ""
                inputStringB = ""
            },
            modifier = Modifier.padding(10.dp)
        ) {

            Text(text = "Calculate")
        }

        Text(
            text = textResult,
            modifier = Modifier.padding(10.dp),
            style = TextStyle(
                fontSize = 20.sp
            )
        )

        //This button allows to go to "Cover" (also in all Exercises)
        Button(
            onClick = {navController.navigate("CoverP15")},
            modifier = Modifier
                .padding(10.dp)
                .align(Alignment.End),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Black)

        ) {
            Text(text = "Previous",
                color = Color.White)
        }
    }
}

private fun compareWords(inputStringA: String, inputStringB: String): Boolean {
    var equals = false
    if (inputStringA.equals(inputStringB)) {
        equals = true
    }
    return equals
}


