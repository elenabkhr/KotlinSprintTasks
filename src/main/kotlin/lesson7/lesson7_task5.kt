package org.example.lesson7

fun main() {
    var randomPassword = ""
    val randomChar = ('1'..'9')
    val randomStringLowercase = ('a'..'z')
    val randomStringUppercase = ('A'..'Z')

    println("Введите длину пароля: ")
    val lengthPassword = readln().toInt()

    for (i in 1..lengthPassword) {
        randomPassword += (randomChar + randomStringLowercase + randomStringUppercase).random()
    }
    println(randomPassword)
}