package com.example.muriach_proyecto_5.ui.theme.Project33

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
In this exercise when you enter the headliner, amount, term and interest, the program show us the
data about our count
*/

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Exercise141(navController: NavController) {
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
                text = "Introduce data",
                modifier = Modifier.padding(5.dp)
            )
        }

        var accountHolderSavings by remember { mutableStateOf("") }
        var amountSavings by remember { mutableStateOf("") }
        var accountHolderFixedTerm by remember { mutableStateOf("") }
        var term by remember { mutableStateOf("") }
        var textResult by remember { mutableStateOf("") }


        OutlinedTextField(
            value = accountHolderSavings,
            onValueChange = { accountHolderSavings = it },
            label = {
                Text("Account Holder Savings Account")
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            singleLine = true
        )

        OutlinedTextField(
            value = amountSavings,
            onValueChange = { amountSavings = it },
            label = {
                Text("Amount Savings Account")
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            singleLine = true,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )

        OutlinedTextField(
            value = term,
            onValueChange = { term = it },
            label = {
                Text("Term")
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            singleLine = true,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )

        // Fixed Term Deposit
        OutlinedTextField(
            value = accountHolderFixedTerm,
            onValueChange = { accountHolderFixedTerm = it },
            label = {
                Text("Account Holder Fixed Term Deposit")
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            singleLine = true
        )

        Button(
            onClick = {
                val bankCount = SaveBank(accountHolderSavings, amountSavings.toDouble())
                val fixedTerm = FixedTerm(accountHolderFixedTerm,
                    amountSavings.toDouble(), term.toInt(), accountHolderFixedTerm.toDouble())

                textResult += bankCount.addMoney(500.0) + "\n"
                textResult += bankCount.calcularInteres()+ "\n"
                textResult += bankCount.showMoney()+ "\n"

                textResult += "\n"

                textResult += fixedTerm.addMoney(1000.0) + "\n"
                textResult += fixedTerm.calcularInteres() + "\n"
                textResult += fixedTerm.withdrawMoney(300.0) + "\n"
                textResult += fixedTerm.showMoney() + "\n"

                      },
            modifier = Modifier.padding(10.dp)
        ) {

            Text(
                text = "Savings Bank",
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
