package org.example.lesson1_10.lesson10

fun main() {
    val userRoll = rollDice("человек")
    val computerRoll = rollDice("машина")

    if (userRoll > computerRoll) println("Победило человечество")
    else if (userRoll == computerRoll) println("Победила дружба")
    else println("Победила машина")
}

fun rollDice(playerName: String): Int {
    val userAction = (1..6).random()
    println("Бросил(а) $playerName, значение на кубиках: $userAction")
    return userAction
}