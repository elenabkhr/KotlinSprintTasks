package org.example.lesson_1_10.lesson10

fun main() {
    validateAndPrintResult(enterUserName(), enterPassword())
}

fun enterUserName(): String {
    println("Введите логин для регистрации: ")
    return readln()
}

fun enterPassword(): String {
    println("Введите пароль для регистрации: ")
    return readln()
}

fun validateAndPrintResult(userName: String, userPassword: String) {
    if (userName.length >= 4 && userPassword.length >= 4) {
        println("Добро пожаловать!")
    } else {
        println("Логин или пароль недостаточно длинные")
    }
}

//Для регистрации в приложении пользователь придумывает логин и пароль.
//И логин, и пароль должны содержать в себе хотя бы 4 символа. Если всё верно, программа выводит приветственное сообщение.

//- считывай логин и пароль с консоли поочередно;
//- вынеси в отдельную функцию валидацию длины введенных данных;
//- если логин или пароль меньше 4 символов – вывести сообщение: "Логин или пароль недостаточно длинные".