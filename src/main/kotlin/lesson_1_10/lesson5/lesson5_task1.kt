package org.example.lesson_1_10.lesson5

fun main() {
    val number1 = 2
    val number2 = 5
    val rightAnswer = number1 + number2

    println("Для аваторизации необходимо сложить два числа: $number1 и $number2")
    val userUnput = readLine()?.toInt()

    if (userUnput == rightAnswer)
        println("Добро пожаловать!")
    else println("Доступ запрещен.")
}