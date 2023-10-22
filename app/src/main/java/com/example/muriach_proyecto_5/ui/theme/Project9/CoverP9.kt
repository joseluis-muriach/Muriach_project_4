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
fun CoverP9(navController: NavController) {
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
            text = "Exercises Project 9",
            fontSize = 40.sp
        )
        Spacer(modifier = Modifier.size(30.dp))

        Row (Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center){
            Button(
                onClick = { navController.navigate("Exercise31") },
                modifier = Modifier.width(200.dp)
                    .padding(5.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.Black)
            ) {
                Text(text = "Exercise 31",
                    color = Color.White
                )
            }

            Button(
                onClick = { navController.navigate("Exercise32") },
                modifier = Modifier.width(200.dp)
                    .padding(5.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.Black)

            ) {
                Text(text = "Exercise 32",
                    color = Color.White
                )
            }
        }

        Row (Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically){
            Button(
                onClick = { navController.navigate("Exercise33") },
                modifier = Modifier.width(200.dp)
                    .padding(5.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.Black)
            ) {
                Text(text = "Exercise 33",
                    color = Color.White
                )
            }

            Button(
                onClick = { navController.navigate("Exercise34") },
                modifier = Modifier.width(200.dp)
                    .padding(5.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.Black)

            ) {
                Text(text = "Exercise 34",
                    color = Color.White
                )
            }
        }

        Row (Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically){
            Button(
                onClick = { navController.navigate("Exercise35") },
                modifier = Modifier.width(200.dp)
                    .padding(5.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.Black)
            ) {
                Text(text = "Exercise 35",
                    color = Color.White
                )
            }

            Button(
                onClick = { navController.navigate("Exercise36") },
                modifier = Modifier.width(200.dp)
                    .padding(5.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.Black)

            ) {
                Text(text = "Exercise 36",
                    color = Color.White
                )
            }
        }

        Row (Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically){
            Button(
                onClick = { navController.navigate("Exercise37") },
                modifier = Modifier.width(200.dp)
                    .padding(5.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.Black)
            ) {
                Text(text = "Exercise 37",
                    color = Color.White
                )
            }

            Button(
                onClick = { navController.navigate("Exercise38") },
                modifier = Modifier.width(200.dp)
                    .padding(5.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.Black)

            ) {
                Text(text = "Exercise 38",
                    color = Color.White
                )
            }
        }

        Row (Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically){
            Button(
                onClick = { navController.navigate("Exercise39") },
                modifier = Modifier.width(200.dp)
                    .padding(5.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.Black)
            ) {
                Text(text = "Exercise 39",
                    color = Color.White
                )
            }

            Button(
                onClick = { navController.navigate("Exercise40") },
                modifier = Modifier.width(200.dp)
                    .padding(5.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color.Black)

            ) {
                Text(text = "Exercise 40",
                    color = Color.White
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
            onClick = {navController.navigate("CoverP8")},
            modifier = Modifier
                .padding(10.dp)
                .align(Alignment.End),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Blue)

        ) {
            Text(text = "Next project")
        }
    }
}
