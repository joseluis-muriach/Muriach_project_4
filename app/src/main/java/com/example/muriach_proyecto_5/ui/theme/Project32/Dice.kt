package com.example.muriach_proyecto_5.ui.theme.Project32

import kotlin.random.Random

open class Dice {
    protected var value: Int = 0

    open fun throwDice(): String {
       value = Random.nextInt(1,7)
        return value.toString()
    }

    fun showValue(): String {
        return "Dice value: $value"
    }
}