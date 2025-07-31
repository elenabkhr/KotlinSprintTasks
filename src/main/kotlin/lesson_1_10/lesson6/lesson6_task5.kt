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
            enteredUserName == userName && enteredUserPassword == userPassword -> {
                println("Авторизация прошла успешно.")
                var attemptCount = 3

                do {
                    val number1 = (1..9).random()
                    val number2 = (1..9).random()
                    val sumNumber = number1 + number2
                    println("Необходимо пройти проверку - сложить два числа $number1 и $number2")
                    val numberUser = readln().toInt()

                    when {
                        numberUser == sumNumber -> {
                            println("Добро пожаловать!")
                            attemptCount = 0
                        }
                        else -> --attemptCount
                    }
                    if (attemptCount == 0) println("Доступ запрещен.")

                } while (attemptCount > 0)
            }
        }
    } while (enteredUserName != userName || enteredUserPassword != userPassword)
}