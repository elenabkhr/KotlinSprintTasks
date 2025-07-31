package org.example.lesson10

fun main() {
    var userVictoryCounter = 0

    while (true) {
        userVictoryCounter += oneRound(userRoll = rollDice2("человек"), computerRoll = rollDice2("машина"))
        println("Хотите бросить кости еще раз? Введите Да или Нет: ")
        val playAgain = readln()

        if (playAgain == "Нет") {
            println("Игра завершена")
            break
        } else {
            println("Игра продолжается")
        }
    }
    println("Выиграно партий: $userVictoryCounter")
}

fun oneRound(userRoll: Int, computerRoll: Int): Int {
    var userVictory = 0
    if (userRoll > computerRoll) {
        println("Победило человечество")
        userVictory++
    } else if (userRoll == computerRoll) println("Победила дружба")
    else println("Победила машина")
    return userVictory
}

fun rollDice2(playerName: String): Int {
    val userAction = (1..6).random()
    println("Бросил(а) $playerName, значение на кубиках: $userAction")
    return userAction
}