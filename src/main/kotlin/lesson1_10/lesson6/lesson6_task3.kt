package org.example.lesson1_10.lesson6

fun main() {
    println("Введите количество секунд: ")
    var seconds = readln().toInt()
    val numberOfSeconds = seconds

    while (seconds > 0) {
        println("Осталось секунд: ${seconds--}")
        Thread.sleep(1000)
    }
    println("Прошло $numberOfSeconds секунд.")
}