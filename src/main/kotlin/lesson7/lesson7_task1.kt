package org.example.lesson7

fun main() {
    var randomPassword = ""

    for (i in 1..6) {

        if (i % 2 == 0) {
            val randomRangeChar = ('1'..'9').random().toString()
            randomPassword += randomRangeChar
        } else {
            val randomRangeString = ('a'..'z').random()
            randomPassword += randomRangeString
        }
    }
    println(randomPassword)
}