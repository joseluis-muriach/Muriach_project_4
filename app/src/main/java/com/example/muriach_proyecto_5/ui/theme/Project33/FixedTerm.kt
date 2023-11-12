package com.example.muriach_proyecto_5.ui.theme.Project33

class FixedTerm(headline: String, amount: Double, val term: Int, val interestRate: Double) :
    BankCount(headline, amount) {

    override fun calcularInteres(): String {
        val interes = (amount * interestRate * term) / 36500
        amount += interes
        return ("Interest generated: $interes. Actually money: $amount")
    }
}