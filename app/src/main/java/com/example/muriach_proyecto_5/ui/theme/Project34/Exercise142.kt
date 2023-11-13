package com.example.muriach_proyecto_5.ui.theme.Project34

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
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
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

/*

*/

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Exercise142(navController: NavController) {
    Text(
        text = "Welcome to: \n 'PROBLEM N.1'",
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
                text = "Introduce data",
                modifier = Modifier.padding(5.dp)
            )
        }

        var coordinateX by remember { mutableStateOf("") }
        var coordinateY by remember { mutableStateOf("") }
        var coordinateZ by remember { mutableStateOf("") }
        var textResult by remember { mutableStateOf("") }


        OutlinedTextField(
            value = coordinateX,
            onValueChange = { coordinateX = it },
            label = {
                Text("Enter coodinate x: ")
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            singleLine = true
        )

        OutlinedTextField(
            value = coordinateY,
            onValueChange = { coordinateY = it },
            label = {
                Text("Enter coodinate y: ")
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            singleLine = true,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )

        OutlinedTextField(
            value = coordinateZ,
            onValueChange = { coordinateZ = it },
            label = {
                Text("Enter coordinate z")
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            singleLine = true,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )

        Button(
            onClick = {
                if (coordinateZ.isEmpty()) {
                    val point2D = Point2D(coordinateX.toDouble(), coordinateY.toDouble())
                    textResult = point2D.toString()
                } else {
                    val point3D =
                        Point3D(coordinateX.toDouble(), coordinateY.toDouble(), coordinateZ.toDouble())
                    textResult = point3D.toString()
                }
                coordinateX = ""
                coordinateY = ""
                coordinateZ = ""
            },
            modifier = Modifier.padding(10.dp)
        ) {

            Text(
                text = "Load point",
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
            onClick = { navController.navigate("CoverP33") },
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
