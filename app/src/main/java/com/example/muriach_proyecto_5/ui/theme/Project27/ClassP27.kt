package com.example.muriach_proyecto_5.ui.theme.Project27

import kotlin.random.Random

class ClassP27 {
    private val array: IntArray = IntArray(5)

    init {
        loadRandomValues()
    }

    private fun loadRandomValues() {
        for (i in array.indices) {
            array[i] = Random.nextInt(0,11)
        }
    }

    fun showArray(): String {
        return "Array: ${array.joinToString(", ")}"
    }

    //This is the contract form, made for android studio
    fun biggestValue(): Int {
        return array.maxOrNull() ?: throw NoSuchElementException("Array is empty.")
    }

    //This is the contract form, made for android studio
    fun smallestValue(): Int {
        return array.minOrNull() ?: throw NoSuchElementException("Array is empty.")
    }
}