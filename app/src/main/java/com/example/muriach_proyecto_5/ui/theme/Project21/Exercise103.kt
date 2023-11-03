package com.example.muriach_proyecto_5.ui.theme.Project21
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
This program return several things:
1: The accumulated value of all numbers
2: The sum of values bigger than 36
3: How many numbers there are bigger than 50
*/

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Exercise103(navController: NavController) {
    Text(
        text = "Welcome to: \n 'PROBLEM N.6'",
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

        val quantityNumbers by remember { mutableStateOf(8) }
        var countNumbers by remember { mutableStateOf(0) }
        var inputNumA by remember { mutableStateOf("") }
        var sumNumbers by remember { mutableStateOf(0) }
        var biggerTheTrirtySixSum by remember { mutableStateOf(0) }
        var quantityValuesBiggerThanFifty by remember { mutableStateOf(0) }
        var textResult by remember { mutableStateOf("") }

        OutlinedTextField(
            value = inputNumA,
            onValueChange = { inputNumA = it },
            label = {
                Text("Introduce a number: ")
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            singleLine = true
        )

        Button(
            onClick = {
                    sumNumbers += inputNumA.toInt()
                    if (inputNumA.toInt() >= 36) {
                        biggerTheTrirtySixSum =+ inputNumA.toInt()
                    }
                    if (inputNumA.toInt() >= 50) {
                        quantityValuesBiggerThanFifty++
                    }

                countNumbers++

                if (quantityNumbers == countNumbers) {
                    textResult = "Accumulated value: $sumNumbers\n" +
                            "Accumulated value bigger tha 36: $biggerTheTrirtySixSum\n" +
                            "Quantity values bigger than 50: $quantityValuesBiggerThanFifty"
                }
                inputNumA = ""
            },
            modifier = Modifier.padding(10.dp)
        ) {

                Text(text = "Check")
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
            onClick = {navController.navigate("CoverP21")},
            modifier = Modifier
                .padding(10.dp)
                .align(Alignment.End),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Green)

        ) {
            Text(text = "Previous",
                color = Color.Black)
        }
    }
}

