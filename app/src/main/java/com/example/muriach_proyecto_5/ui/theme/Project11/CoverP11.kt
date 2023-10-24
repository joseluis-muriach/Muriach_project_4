package com.example.muriach_proyecto_5.ui.theme.Project9

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
fun CoverP11(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Image(
            painter = painterResource(R.drawable.android),
            contentDescription = "",
            modifier = Modifier
                .size(200.dp)
                .padding(bottom = 30.dp)
        )

        Text(
            text = "Exercises Project 11",
            fontSize = 40.sp
        )
        Spacer(modifier = Modifier.size(30.dp))

        Row (Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center){
            Button(
                onClick = { navController.navigate("Exercise52") },
                modifier = Modifier.width(200.dp)
                    .padding(5.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.Green)
            ) {
                Text(text = "Exercise 52",
                    color = Color.Black
                )
            }

            Button(
                onClick = { navController.navigate("Exercise53") },
                modifier = Modifier.width(200.dp)
                    .padding(5.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.Green)

            ) {
                Text(text = "Exercise 53",
                    color = Color.Black
                )
            }
        }

        Row (Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically){
            Button(
                onClick = { navController.navigate("Exercise54") },
                modifier = Modifier.width(200.dp)
                    .padding(5.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.Green)
            ) {
                Text(text = "Exercise 54",
                    color = Color.Black
                )
            }

            Button(
                onClick = { navController.navigate("Exercise55") },
                modifier = Modifier.width(200.dp)
                    .padding(5.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.Green)

            ) {
                Text(text = "Exercise 55",
                    color = Color.Black
                )
            }
        }

        Row (Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically){
            Button(
                onClick = { navController.navigate("Exercise56") },
                modifier = Modifier.width(200.dp)
                    .padding(5.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.Green)
            ) {
                Text(text = "Exercise 56",
                    color = Color.Black
                )
            }

            Button(
                onClick = { navController.navigate("Exercise57") },
                modifier = Modifier.width(200.dp)
                    .padding(5.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.Green)

            ) {
                Text(text = "Exercise 57",
                    color = Color.Black
                )
            }
        }

        Row (Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically){
            Button(
                onClick = { navController.navigate("Exercise58") },
                modifier = Modifier.width(200.dp)
                    .padding(5.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.Green)
            ) {
                Text(text = "Exercise 58",
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
            onClick = {navController.navigate("CoverP12")},
            modifier = Modifier
                .padding(10.dp)
                .align(Alignment.End),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Yellow)

        ) {
            Text(text = "Next project",
            color = Color.Black)
        }
    }
}
