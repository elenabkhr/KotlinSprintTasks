package org.example.lesson_1_10.lesson7

fun main() {
    var randomPassword = ""
    val randomRangeChar = ('1'..'9')
    val randomRangeString = ('a'..'z')

    for (i in 1..6) {

        if (i % 2 == 0) {
            randomPassword += randomRangeChar.random()
        } else {
            randomPassword += randomRangeString.random()
        }
    }
    println(randomPassword)
}