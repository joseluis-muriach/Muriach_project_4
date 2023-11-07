package com.example.muriach_proyecto_5.ui.theme.Project24

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
import com.example.muriach_proyecto_5.ui.theme.Project23.Student

/*
This exercise is equal at exercise number 111.
*/

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Exercise115(navController: NavController) {
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
        var inputName by remember { mutableStateOf("") }
        var inputMark by remember { mutableStateOf("") }
        val maxNumStudent by remember { mutableStateOf(2) }
        var countStudents by remember { mutableStateOf(0) }
        var totalStudents by remember { mutableStateOf("") }
        var textResult by remember { mutableStateOf("") }

        OutlinedTextField(
            value = inputName,
            onValueChange = { inputName = it },
            label = {
                Text("Enter the student name:")
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            singleLine = true
        )

        OutlinedTextField(
            value = inputMark,
            onValueChange = { inputMark = it },
            label = {
                Text("Enter the student mark:")
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            singleLine = true
        )

        Button(
            onClick = {
                val student = Student(inputName, inputMark.toDouble())
                totalStudents += " $student\n"
                val isRegul = student.showRegular()
                totalStudents += "$isRegul\n\n"
                countStudents++

                if (countStudents == maxNumStudent) {
                    textResult = "$totalStudents\n"
                }
                inputName = ""
                inputMark = ""
            },
            modifier = Modifier.padding(10.dp)
        ) {

            Text(text = "Load")
        }

        Text(
            text =textResult,
            modifier = Modifier.padding(10.dp),
            style = TextStyle(
                fontSize = 20.sp
            )
        )

        //This button allows to go to "Cover" (also in all Exercises)
        Button(
            onClick = {navController.navigate("CoverP24")},
            modifier = Modifier
                .padding(10.dp)
                .align(Alignment.End),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Black)

        ) {
            Text(text = "Previous",
                color = Color.White
            )
        }
    }
}

