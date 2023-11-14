package com.example.muriach_proyecto_5.ui.theme.Project36

class Person(
    val name: String,
    val age: Int
) {
    fun isBiggerThan18(
        isBigger: (Int) -> Boolean): Boolean {
        return isBigger(age)
    }
}