package com.example.muriach_proyecto_5.ui.theme.Project28

import java.util.Random

class Dice (
    var value: Int
) {
    companion object { //Is how make static (in java)

        fun randomNumber(): Int {
            var randNum = kotlin.random.Random.nextInt(1, 7)
            return randNum
        }

        fun loadValue(value: Int): String {
            var number = 0
            if (value in 1..6) {
                number = value
            } else {
                number = 1
            }
            return number.toString()
        }
    }
}