package org.example.lesson1_10.lesson7

fun main() {
    var randomPassword = ""
    val randomChar = ('1'..'9')
    val randomStringLowercase = ('a'..'z')
    val randomStringUppercase = ('A'..'Z')

    println("Введите длину пароля: ")
    val lengthPassword = readln().toInt()

    if (lengthPassword < 6) {
        println("Минимальная длина пароля: 6 символов")
    } else {
        randomPassword += randomChar.random()
        randomPassword += randomStringLowercase.random()
        randomPassword += randomStringUppercase.random()

        for (i in 1..lengthPassword - 3) {
            randomPassword += (randomChar + randomStringLowercase + randomStringUppercase).random()
        }
        println(randomPassword.toList().shuffled().joinToString(""))
    }
}