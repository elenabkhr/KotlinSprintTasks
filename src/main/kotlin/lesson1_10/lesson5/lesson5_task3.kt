package org.example.lesson1_10.lesson5

fun main() {
    val rightNumber1 = 10
    val rightNumber2 = 20

    println("Для победы необходимо угадать два числа от 0 до 42")
    println("Введите первое число: ")
    val userNumber1 = readln().toInt()
    println("Введите второй число: ")
    val userNumber2 = readln().toInt()

    if (userNumber1 == userNumber2) {
        println("Числа должны быть разными, попробуйте еще раз.")
    } else {
        if ((userNumber1 == rightNumber1 || userNumber1 == rightNumber2) && (userNumber2 == rightNumber1 || userNumber2 == rightNumber2)) {
            println("Поздравляем! Вы выиграли главный приз!")
        } else if (userNumber1 == rightNumber1 || userNumber1 == rightNumber2 || userNumber2 == rightNumber1 || userNumber2 == rightNumber2) {
            println("Вы выиграли утешительный приз!")
        } else println("Неудача!")
    }
}