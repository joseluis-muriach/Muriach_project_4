package com.example.muriach_proyecto_5.ui.theme.Project35

data class Article(val code: Int, val descripcion: String, var price: Float)

class Inventory(val articles: Array<Article>) {
    fun showArticles(): String {
        val stringBuilder = StringBuilder()
        stringBuilder.append("Inventory components:\n")
        articles.forEach { stringBuilder.append("$it\n") }
        stringBuilder.append("\n")
        return stringBuilder.toString()
    }

    fun increasePrice(percentage: Float): String {
        val stringBuilder = StringBuilder()
        stringBuilder.append("Aumentando en $percentage% el precio de todos los productos:\n")
        articles.forEach { it.price *= (1 + percentage) }
        stringBuilder.append("Aumento completado.\n\n")
        return stringBuilder.toString()
    }
}