package org.example.lesson1_10.lesson6

fun main() {
    var attemptCount = 5
    val correctNumber = (1..9).random()

    while (attemptCount > 0) {
        println("Введите ваше число: ")
        val userNumber = readln().toInt()

        when {
            userNumber == correctNumber -> {
                println("Это была великолепная игра!")
                attemptCount = 0
            }

            userNumber != correctNumber -> println("Число неверное, оставшееся количество попыток: ${--attemptCount}")
        }
    }
    println("Было загадано число: $correctNumber")
}