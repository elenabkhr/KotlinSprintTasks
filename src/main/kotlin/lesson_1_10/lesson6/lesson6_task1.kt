package org.example.lesson_1_10.lesson6

fun main() {
    println("Желаете пройти регистрацию?")
    println("Введите логин: ")
    val userName = readln()

    println("Введите пароль: ")
    val userPassword = readln()

    do {
        println("Для авторизации необходимо ввести логин и пароль.")
        println("Введите логин: ")
        val enteredUserName = readln()
        println("Введите пароль: ")
        val enteredUserPassword = readln()

        when {
            enteredUserName == userName && enteredUserPassword == userPassword -> println("Авторизация прошла успешно.")
        }

    } while (enteredUserName != userName || enteredUserPassword != userPassword)
}
