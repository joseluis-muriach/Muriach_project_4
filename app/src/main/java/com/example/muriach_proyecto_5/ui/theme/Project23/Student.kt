package com.example.muriach_proyecto_5.ui.theme.Project23

import java.util.Scanner

class Student(
    var name: String,
    var mark: Double
) {
    fun enterData() {
        val scanner = Scanner(System.`in`)

        print("Enter the name of the student")
        name = scanner.nextLine()

        print("Enter the mark of the student")
        mark = scanner.nextDouble()
    }

    fun printData() {
        print("The name of the student is: $name")
        print("The mark of the student is: $mark")
    }

//    fun isRegular(): Boolean {
//        return mark >= 4.0
//    }

    fun showRegular():String {
        var result = ""
        if (mark >= 4) {
            result = "$name is regular."
        } else {
            result = "$name isn't regular."
        }
        return result
    }

    override fun toString(): String {
        return "- Student '$name' with mark: $mark"
    }
}
