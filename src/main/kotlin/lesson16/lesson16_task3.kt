package org.example.lesson16

fun main() {
    val user = User()

    println("Введите пароль: ")
    val inputPassword = readln()

    if (user.checkPassword(inputPassword)) println("Пароль введен верно")
    else println("Пароль введен неверно")
}

class User(val login: String = "login", private val password: String = "password") {

    fun checkPassword(inputPassword: String): Boolean {
        return password == inputPassword
    }
}