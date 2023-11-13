package com.example.muriach_proyecto_5.ui.theme.Project34


class Point2D(val x: Double, val y: Double): Point {
    override fun imprimir() {
       print(toString())
    }

    override fun toString(): String{
        return "Point2D: ($x, $y)"
    }
}