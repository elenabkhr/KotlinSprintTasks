package org.example.lesson_1_10.lesson6

const val MILLIS_IN_SECOND = 1000

fun main() {
    println("Введите количество секунд: ")
    val seconds = readln()

    Thread.sleep(seconds.toLong() * MILLIS_IN_SECOND)

    println("Прошло $seconds секунд.")
}