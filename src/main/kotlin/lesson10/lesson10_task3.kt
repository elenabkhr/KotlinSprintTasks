package org.example.lesson10

fun main() {
    println(generatePassword())
}

fun generatePassword(): String {

    println("Введите длину пароля: ")
    val lengthPassword = readln().toInt()

    var createPassword = ""
    val randomNumber = (0..9)
    val specialChars = (32..47).map { it.toChar() }

    for (i in 1..lengthPassword) {
        if (i % 2 == 0) {
            createPassword += randomNumber.random()
        } else {
            createPassword += specialChars.random()
        }
    }
    return createPassword
}

//Напиши программу, которая генерирует пароли.
//Пароль должен состоять из последовательно чередующихся цифр и специальных символов. Например, 4#4%2!.

//- пользователь сам задает длину пароля;
//- для генерации пароля должна быть отдельная функция,
//принимающая целочисленное значение длины пароля и возвращающая готовый пароль;
//- пароль должен содержать цифры от 0 до 9, специальные символы: !"#$%&'()*+,-./ и пробел (всего 16 спецсимволов).