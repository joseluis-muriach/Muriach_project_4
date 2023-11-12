package com.example.muriach_proyecto_5.ui.theme.Project28

class Employe(
    var name: String,
    var salary: Double
) {
    fun newEmployee(): String {
        var employe: String

        if (salary > 0 ) {
            employe = "- $name, $salary"
        } else {
            employe = "The sdlary can't be smaller than 0"
        }
        return employe
    }
}