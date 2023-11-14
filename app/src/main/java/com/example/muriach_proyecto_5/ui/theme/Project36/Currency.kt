package com.example.muriach_proyecto_5.ui.theme.Project36

import kotlin.random.Random

class Currency {
    //Initialize the currency in "face"
    var side: String = "heads"

    fun rollCurrency(){
        //Generate random:
        side = if (Random.nextBoolean()) "heads" else "tails"
    }

    fun printSide(): String {
        return "The side of currency in: $side"
    }
}