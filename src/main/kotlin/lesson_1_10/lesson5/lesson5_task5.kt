package org.example.lesson_1_10.lesson5

fun main() {
    println("Для победы необходимо угадать три числа от 0 до 42")
    println("Введите первое число: ")
    val userNumber1 = readln().toInt()

    println("Введите второе число: ")
    val userNumber2 = readln().toInt()

    println("Введите третье число: ")
    val userNumber3 = readln().toInt()

    val listOfNumberUser = listOf(userNumber1, userNumber2, userNumber3)

    val randomNumber = List(3) { (0..42).random() }

    val intersectionUserRandom = listOfNumberUser.intersect(randomNumber)

    when (intersectionUserRandom.size) {
        3 -> println("Поздравляем! Вы выиграли джекпот!")
        2 -> println("Поздравляем! Вы выиграли крупный приз!")
        1 -> println("Вы выиграли утешительный приз!")
        0 -> println("Вы не угадали ни одного числа.")
    }
    println("Выигрышние числа: $randomNumber")
}