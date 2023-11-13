package com.example.muriach_proyecto_5.ui.theme.Project34

class Point3D(val x: Double, val y: Double, val z: Double): Point {
    override fun imprimir() {
        print(toString())
    }

    override fun toString(): String{
        return "Point3D: ($x, $y, $z)"
    }
}