package org.example.lesson_1_10.lesson7

fun main() {
    println("Введите число: ")
    val userNumber = readln().toInt()

    for (i in 0..userNumber step 2)
        println(i)
}