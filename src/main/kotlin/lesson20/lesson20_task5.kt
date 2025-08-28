package org.example.lesson20

fun main() {
    val robot = Robot()
    robot.say()
    robot.setModifier { it.reversed()}
    robot.say()
}

class Robot() {
    var listPhrase = listOf(
        "Первая фраза",
        "Вторая фраза",
        "Третья фраза",
        "Четвертая фраза",
        "Пятая фраза"
    )

    var phraseModifier: ((String) -> String)? = null

    fun setModifier(modifier: (String) -> String) {
        phraseModifier  = modifier
    }

    fun say() {
        val phrase = listPhrase.random()
        val finalPhrase = phraseModifier?.invoke(phrase) ?: phrase
        println(finalPhrase)
    }
}