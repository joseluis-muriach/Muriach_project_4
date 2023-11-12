package com.example.muriach_proyecto_5.ui.theme.Project33

abstract class BankCount(var headline: String, var amount: Double) {
    abstract fun calcularInteres(): String
    fun addMoney(quantity: Double):String {
        amount += quantity
        return ("Add to my count $quantity. Total money: $amount")
    }

    fun withdrawMoney(quantity: Double): String {
        var result = ""
        if (quantity <= amount) {
            amount -= quantity
            result = ("Withdrawal of $quantity. Total money: $amount")
        } else {
            result = ("Insufficient funds.")
        }
        return result
    }

    fun showMoney(): String {
        return ("Actually money: $amount")
    }
}