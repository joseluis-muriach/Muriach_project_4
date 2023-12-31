package com.example.muriach_proyecto_5.ui.theme.Project26

class Club (
    var partnerA: Partner = Partner("Jose Luis", 1),
    var partnerB: Partner = Partner("Luis", 5),
    var partnerC: Partner = Partner("Jose", 30)
) {
    fun moreAntiquity(): String {
        var result: String

        if (partnerA.antiquity > partnerB.antiquity && partnerA.antiquity > partnerC.antiquity) {
            result = partnerA.toString()
        } else if (partnerB.antiquity > partnerC.antiquity){
            result = partnerB.toString()
        } else {
            result = partnerC.toString()
        }
        return result
    }
}


