package org.example.lesson6

fun main() {
    println("Введите количество секунд: ")
    var seconds = readln().toInt()
    val numberOfSeconds = seconds

    while (seconds > 0) {
        seconds--
        Thread.sleep(1000)
    }
    println("Прошло $numberOfSeconds секунд.")
}