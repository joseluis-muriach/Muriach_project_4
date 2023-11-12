package com.example.muriach_proyecto_5.ui.theme.Project31

object Greater {
    fun maximum(a: Int, b: Int): Int {
        return if (a > b) a else b
    }

    fun maximum(a: Float, b: Float): Float {
        return if (a > b) a else b
    }

    fun maximum(a: Double, b: Double): Double {
        return if (a > b) a else b
    }
}