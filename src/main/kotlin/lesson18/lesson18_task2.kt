package org.example.lesson18

fun main() {
    val fourSided = FourSided()
    val sixSided = SixSided()
    val eightSided = EightSided()

    val listResult = listOf<Dice>(fourSided, sixSided, eightSided)
    showAllResult(listResult)
}

fun showAllResult(result: List<Dice>) {
    result.forEach {
        (it.rollDice())
    }
}

open class Dice() {
    open fun rollDice() {
    }
}

class FourSided(private val numberOfSides: Int = 4) : Dice() {
    override fun rollDice() {
        val resultRollDice = (1..numberOfSides).random()
        println("Брошена кость ($numberOfSides грани), результат броска: $resultRollDice")
    }
}

class SixSided(private val numberOfSides: Int = 6) : Dice() {
    override fun rollDice() {
        val resultRollDice = (1..numberOfSides).random()
        println("Брошена кость ($numberOfSides граней), результат броска: $resultRollDice")
    }
}

class EightSided(private val numberOfSides: Int = 8) : Dice() {
    override fun rollDice() {
        val resultRollDice = (1..numberOfSides).random()
        println("Брошена кость ($numberOfSides граней), результат броска: $resultRollDice")
    }
}