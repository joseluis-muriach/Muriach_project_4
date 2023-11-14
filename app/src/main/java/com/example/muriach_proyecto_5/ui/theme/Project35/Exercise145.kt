package com.example.muriach_proyecto_5.ui.theme.Project35

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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

@Composable
fun Exercise145(navController: NavController) {
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
                text = "In the code you can change the values if you want",
                modifier = Modifier.padding(5.dp)
            )
        }

        var textResult by remember { mutableStateOf("") }


        Button(
            onClick = {
                      val inventory = Inventory(
                          arrayOf(
                              Article(1, "ArticleA", 100.0f),
                              Article(2, "ArticleB", 100.0f),
                              Article(3, "ArticleC", 100.0f),
                              Article(4, "ArticleD", 100.0f)
                          )
                      )
                textResult +=
                    inventory.showArticles() + "\n"
                textResult += inventory.increasePrice(0.1f) + "\n"
                textResult += inventory.showArticles()
            },
            modifier = Modifier.padding(10.dp)
        ) {

            Text(
                text = "Load inventory",
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
            onClick = { navController.navigate("CoverP35") },
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
