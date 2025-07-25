package org.example.lesson7

fun main() {
    println("Введите количество секунд: ")
    val numberOfSeconds = readln().toInt()

    for (i in 0..numberOfSeconds) {
        println("Прошло $i секунд")
        println("Осталось ${numberOfSeconds - i} секунд")
        if (i == numberOfSeconds) println("Время вышло")
        Thread.sleep(1000)
    }
}