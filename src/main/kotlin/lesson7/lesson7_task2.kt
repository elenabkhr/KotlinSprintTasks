package org.example.lesson7

fun main() {
    val rangeRandom = (1000..9999)

    do {
        val randomCode = rangeRandom.random()
        println("Ваш код авторизации: ${randomCode}.")

        var isAuthorized = false
        println("Для авторизации необходимо ввести код из СМС:")
        val userCode = readln().toInt()

        when {
            userCode == randomCode -> {
                println("Добро пожаловать!")
                isAuthorized = true
            }
            else -> {
                println("Код введен неверно, введите новый код")
            }
        }
    } while (!isAuthorized)
}