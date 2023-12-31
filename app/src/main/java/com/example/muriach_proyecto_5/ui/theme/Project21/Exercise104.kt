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
import com.example.muriach_proyecto_5.ui.theme.Project18.sum

/*
This program return four sums of input number a and b
*/

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Exercise104(navController: NavController) {
    Text(
        text = "Welcome to: \n 'PROBLEM N.7'",
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
            Text(text = "When you introduce 4 sums, the program return the results",
                modifier = Modifier.padding(5.dp))
        }

        var inputNumA by remember { mutableStateOf("") }
        var inputNumB by remember { mutableStateOf("") }
        var countNums by remember { mutableStateOf(0) }
        var countResult by remember { mutableStateOf(1) }
        var resultNums by remember { mutableStateOf("") }
        var tempResult by remember { mutableStateOf("") }
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

        OutlinedTextField(
            value = inputNumB,
            onValueChange = { inputNumB = it },
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
                tempResult = "- Result $countResult: " + sumNumbers(inputNumA.toInt(), inputNumB.toInt())
                 resultNums = resultNums + tempResult + "\n"
                countNums++
                if (countNums == 4) {
                    textResult = resultNums
                }
                inputNumA = ""
                inputNumB = ""
                tempResult = ""
                countResult++
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

fun sumNumbers(numA: Int, numB: Int): Int {
    return numA + numB
}

