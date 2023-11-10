package com.example.muriach_proyecto_5.ui.theme.Project25

fun arrayAges(array: List<Int>): List<Int> {
    //Used the function distrinct() to delete duplicates
    return array.toList().distinct()
}

fun greatestAge(array: List<Int>) : String {
    var greatAge = 0

    for (age in array) {
        if (age > greatAge) {
            greatAge = age
        }
    }
    return greatAge.toString()
}
fun smallestAge(array: List<Int>) : String {
    var greatAge = 200
    var result = ""

    for (age in array) {
        if (age < greatAge) {
            greatAge = age
        }
    }
    return greatAge.toString()
}