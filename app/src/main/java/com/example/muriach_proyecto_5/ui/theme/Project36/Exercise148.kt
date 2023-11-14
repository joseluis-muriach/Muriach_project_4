package com.example.muriach_proyecto_5.ui.theme.Project36

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
*/

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Exercise148(navController: NavController) {
    Text(
        text = "Welcome to: \n 'PROBLEM N.2'",
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
            Text(
                text = "",
                modifier = Modifier.padding(5.dp)
            )
        }

        var countPerson by remember { mutableStateOf(1) }
        var memoryResult by remember { mutableStateOf("") }
        var inputName by remember { mutableStateOf("") }
        var inputAge by remember { mutableStateOf("") }
        var textResult by remember { mutableStateOf("") }

        OutlinedTextField(
            value = inputName,
            onValueChange = { inputName = it },
            label = {
                Text("Enter a name:")
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            singleLine = true
        )

        OutlinedTextField(
            value = inputAge,
            onValueChange = { inputAge = it },
            label = {
                Text("Enter a age:")
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            singleLine = true
        )

        Button(
            onClick = {

                if (countPerson != 2) {
                    val personA = Person(inputName, inputAge.toInt())
                    val isBiggerEEUU: (Int) -> Boolean = { age -> age >= 21 }
                    val isBiggerArgentina: (Int) -> Boolean = {age -> age >= 18}

                    memoryResult +=
                        "${personA.name} is bigger than 18 in EEUU: ${personA.isBiggerThan18(isBiggerEEUU)} \n"
                    memoryResult +=
                        "${personA.name} is bigger than 18 in EEUU: ${personA.isBiggerThan18(isBiggerArgentina)} \n"
                    memoryResult += "\n"
                    countPerson++
                } else {
                    val personB = Person(inputName, inputAge.toInt())
                    val isBiggerEEUU: (Int) -> Boolean = { age -> age >= 21 }
                    val isBiggerArgentina: (Int) -> Boolean = {age -> age >= 18}

                    memoryResult +=
                        "${personB.name} is bigger than 18 in EEUU: ${personB.isBiggerThan18(isBiggerEEUU)} \n"
                    memoryResult +=
                        "${personB.name} is bigger than 18 in EEUU: ${personB.isBiggerThan18(isBiggerArgentina)}"
                    textResult = memoryResult
                }
                inputName = ""
                inputAge = ""
            },
            modifier = Modifier.padding(10.dp)
        ) {

            Text(
                text = "Load the result",
            )
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
            onClick = { navController.navigate("CoverP36") },
            modifier = Modifier
                .padding(10.dp)
                .align(Alignment.End),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Blue)

        ) {
            Text(
                text = "Previous",
                color = Color.White
            )
        }
    }
}

