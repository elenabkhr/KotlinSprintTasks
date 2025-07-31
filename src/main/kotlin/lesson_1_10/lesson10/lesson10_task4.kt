package org.example.lesson_1_10.lesson10

fun main() {
    var winCount = 0

    while (true) {
        winCount += playRound(userRoll = rollDice2("человек"), computerRoll = rollDice2("машина"))
        println("Хотите бросить кости еще раз? Введите Да или Нет: ")
        val playAgain = readln()

        if (playAgain.equals("нет", ignoreCase = true)) {
            println("Игра завершена")
            break
        } else {
            println("Игра продолжается")
        }
    }
    println("Выиграно партий: $winCount")
}

fun playRound(userRoll: Int, computerRoll: Int): Int {
    var userVictory = 0

    when {
        userRoll > computerRoll -> {
            println("Победило человечество")
            userVictory++
        }
        userRoll == computerRoll -> println("Победила дружба")
        else -> println("Победила машина")
    }
    return userVictory
}

fun rollDice2(playerName: String): Int {
    val userAction = (1..6).random()
    println("Бросил(а) $playerName, значение на кубиках: $userAction")
    return userAction
}