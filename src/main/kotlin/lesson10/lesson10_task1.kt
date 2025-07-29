package org.example.lesson10

fun main() {
    val userAction = userAction()
    val computerAction = computerAction()

    if (userAction > computerAction) println("Победило человечество")
    else if (userAction == computerAction) println("Победила дружба")
    else println("Победила машина")
}

fun userAction(): Int {
    val userAction = (1..6).random()
    println("Бросил человек, значение на кубиках: $userAction")
    return userAction
}

fun computerAction(): Int {
    val computerAction = (1..6).random()
    println("Бросила машина, значение на кубиках: $computerAction")
    return computerAction
}