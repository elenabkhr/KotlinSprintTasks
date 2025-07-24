package org.example.lesson7

fun main() {
    do {
        val randomCode = (1000..9999).random()
        println("Ваш код авторизации: $randomCode.")

        var isAuthorized = false
        println("Для авторизации необходимо ввести код из СМС:")
        val userCode = readln().toInt()

        when {
            userCode == randomCode -> {
                println("Добро пожаловать!")
                isAuthorized = true
            }

            userCode != randomCode -> {
                println("Код введен неверно, введите новый код")
            }
        }
    } while (isAuthorized == false)
}