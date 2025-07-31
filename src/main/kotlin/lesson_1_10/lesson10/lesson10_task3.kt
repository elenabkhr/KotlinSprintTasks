package org.example.lesson_1_10.lesson10

fun main() {
    println("Введите длину пароля: ")
    val lengthPassword = readln().toInt()

    println(generatePassword(lengthPassword))
}

fun generatePassword(length: Int): String {
    var createPassword = ""
    val randomNumber = (0..9)
    val specialChars = (' '..'/')

    for (i in 1..length) {
        if (i % 2 == 0) {
            createPassword += randomNumber.random()
        } else {
            createPassword += specialChars.random()
        }
    }
    return createPassword
}