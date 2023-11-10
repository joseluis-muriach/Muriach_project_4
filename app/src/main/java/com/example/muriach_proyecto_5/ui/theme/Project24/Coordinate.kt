package com.example.muriach_proyecto_5.ui.theme.Project24

class Coordinate(var coordinateX: Double, var coordinateY: Double) {
    companion object { //This is to make the function "Static" (like in java)
        fun whereIsTheCoordinate(coordinate: Coordinate): String {
            val (x, y) = coordinate.getCoordinate()
            var resutl = ""

            if (x > 0 && y > 0) {
                resutl = "- First quadrant"
            } else if (x < 0 && y > 0) {
                resutl = "- Second quadrant"
            } else if (x > 0 && y < 0) {
                resutl = "- Third quadrant"
            } else if (x < 0 && y < 0) {
                resutl = "- Fourth quadrant"
            } else if (x == 0.0 && y == 0.0) {
                resutl = "- The point lies on an axis"
            }

            return resutl
        }

    }
    fun getCoordinate(): Pair<Double, Double> {
        return Pair(coordinateX, coordinateY)
    }

}
