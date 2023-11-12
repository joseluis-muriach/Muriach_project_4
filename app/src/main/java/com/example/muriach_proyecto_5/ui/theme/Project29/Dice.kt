package com.example.muriach_proyecto_5.ui.theme.Project29

data class Dice(
    val value: Int
) {
    override fun toString(): String {
        return buildString {
            append("Dice(value = $value): ")
            for (i in 1..value) {
                append("*")
            }
        }
    }
}