package org.example.lesson10

fun main() {
    printResult(enterUserName(), enterPassword())
}

fun enterUserName(): String {
    println("Введите логин для регистрации: ")
    return readln()
}

fun enterPassword(): String {
    println("Введите пароль для регистрации: ")
    return readln()
}

fun printResult(userName: String, userPassword: String): String {
    if (userName.length > 4 || userPassword.length > 4) {
        return "Добро пожаловать!"
    } else {
        return "Логин или пароль недостаточно длинные"
    }
}