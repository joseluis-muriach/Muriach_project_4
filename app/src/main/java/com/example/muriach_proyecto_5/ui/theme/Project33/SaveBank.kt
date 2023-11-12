package com.example.muriach_proyecto_5.ui.theme.Project33

class SaveBank(headline: String, amount: Double) : BankCount(headline, amount) {
    override fun calcularInteres(): String {
        return ("The savings account does not generate interest..")
    }
}