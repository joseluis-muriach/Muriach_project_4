package com.example.muriach_proyecto_5.ui.theme.Project32

class DiceBox : Dice() {
    override fun throwDice() {
        super.throwDice()
        println("Value dice box: ${"*".repeat(value)}")

    }
}