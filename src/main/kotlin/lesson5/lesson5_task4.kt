package org.example.lesson5

fun main() {
    val userName = "Zaphod"
    val userPassword = "PanGalactic"

    println("Введите имя пользователя: ")
    val enteredUserName = readln()
    if (enteredUserName == userName) {
        println("Введите пароль: ")
        val enteredUserPassword = readln()
        if (enteredUserPassword == userPassword) {
            println("Верификация прошла успешно. Добро пожаловать на космический корабль.")
        } else {
            println("[вздыхает...] Пароль неверный, попробуйте еще раз...")
        }
    } else {
        println("Такого пользователя не существует...")
    }
}