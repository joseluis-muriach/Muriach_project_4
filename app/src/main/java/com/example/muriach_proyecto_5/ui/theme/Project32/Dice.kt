package com.example.muriach_proyecto_5.ui.theme.Project32

import kotlin.random.Random

open class Dice {
    protected var value: Int = 0

    open fun throwDice() {
       value = Random.nextInt(1,7)
    }

    fun showValue(): String {
        return "Dice value: $value"
    }
}