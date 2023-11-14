package com.example.muriach_proyecto_5.ui.theme.Project35

import kotlin.random.Random

class Dice {
    //Initialize the dice in value 1
    var value: Int = 1

    fun rollDice() {
        //Generate a random number between 1 and 6
        value = Random.nextInt(1, 7)
    }

    fun printValue(): String {
        return "The value of dice is: $value"
    }
}