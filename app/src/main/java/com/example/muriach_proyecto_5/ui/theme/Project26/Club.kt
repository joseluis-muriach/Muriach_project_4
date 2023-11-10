package com.example.muriach_proyecto_5.ui.theme.Project26

var partnerA = Partner("Jose Luis", 1)
var partnerB = Partner("Luis", 5)
var partnerC = Partner("Jose", 3)

fun moreAntiquity(partnerA: Partner, partnerB: Partner, partnerC: Partner): String {
    var result = ""

    if (partnerA.antiquity > partnerB.antiquity && partnerA.antiquity > partnerC.antiquity) {
        result = partnerA.toString()
    } else if (partnerB.antiquity > partnerC.antiquity){
        result = partnerB.toString()
    } else {
        result = partnerC.toString()
    }
    return result
}