package org.example.lesson_1_10.lesson7

fun main() {
    println("Введите количество секунд: ")
    val numberOfSeconds = readln().toInt()

    for (i in numberOfSeconds downTo 0) {
        println("Прошло ${(numberOfSeconds - i)} секунд")
        println("Осталось $i секунд")
        Thread.sleep(1000)
    }
    println("Время истекло")
}