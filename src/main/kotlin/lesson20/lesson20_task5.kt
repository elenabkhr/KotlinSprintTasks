package org.example.lesson20

fun main() {
    val robot = Robot()
    robot.say()
    robot.setModifier { it.reversed() }
    robot.say()
}

class Robot {
    val listPhrase = listOf(
        "Первая фраза",
        "Вторая фраза",
        "Третья фраза",
        "Четвертая фраза",
        "Пятая фраза"
    )

    var phraseModifier: ((String) -> String) = { it }

    fun setModifier(modifier: (String) -> String) {
        phraseModifier = modifier
    }

    fun say() {
        val phrase = listPhrase.random()
        val finalPhrase = phraseModifier(phrase)
        println(finalPhrase)
    }
}