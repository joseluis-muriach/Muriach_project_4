package com.example.muriach_project_6

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.muriach_proyecto_5.R

@Composable
fun CoverP6(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        Arrangement.Center
    ) {

        Row(
            modifier = Modifier.fillMaxWidth(),
            Arrangement.Center
        ) {
            Image(
                painter = painterResource(R.drawable.android),
                contentDescription = "",
                modifier = Modifier
                    .size(200.dp)
                    .padding(bottom = 30.dp)
                    .fillMaxWidth(),
            )
        }

        Row(
            modifier = Modifier.fillMaxWidth(),
            Arrangement.Center
        ) {

            Text(
                text = "Exercises Project 6",
                fontSize = 40.sp,
                modifier = Modifier.padding(20.dp)
            )

            Spacer(modifier = Modifier.size(30.dp))
        }

        Row(Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            Button(
                onClick = { navController.navigate("Exercise15") },
                modifier = Modifier
                    .width(200.dp)
                    .padding(4.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.Green)

            ) {
                Text(
                    text = "Exercise 15",
                    color = Color.Black
                )
            }
        }

        Row(Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            Button(
                onClick = { navController.navigate("Exercise16") },
                modifier = Modifier
                    .width(200.dp)
                    .padding(4.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.Green)

            ) {
                Text(text = "Exercise 16",
                    color = Color.Black
                )
            }

        }

        Row(modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            Button(
                onClick = { navController.navigate("Exercise17") },
                modifier = Modifier
                    .width(200.dp)
                    .padding(4.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.Green)

            ) {
                Text(
                    text = "Exercise 17",
                    color = Color.Black
                )
            }
        }

        Button(
            onClick = {navController.navigate("CoverMain")},
            modifier = Modifier.align(Alignment.Start),
            colors = ButtonDefaults.buttonColors(containerColor = Color.DarkGray)


        ) {
            Text(text = "All projects")
        }
        Button(
            onClick = {navController.navigate("CoverP7")},
            modifier = Modifier.padding(10.dp)
                .align(Alignment.End),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Yellow)

        ) {
            Text(text = "Next project",
                color = Color.Black
            )
        }
    }
}