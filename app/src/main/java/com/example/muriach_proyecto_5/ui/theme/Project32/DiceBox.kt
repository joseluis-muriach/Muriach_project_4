package com.example.muriach_proyecto_5.ui.theme.Project32

class DiceBox : Dice() {
    override fun throwDice(): String {
        super.throwDice()
        return ("Value dice box: ${"*".repeat(value)}")
    }
}