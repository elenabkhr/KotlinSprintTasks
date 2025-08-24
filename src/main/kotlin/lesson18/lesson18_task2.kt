package org.example.lesson18

fun main() {
    val fourSided = FourSided()
    val sixSided = SixSided()
    val eightSided = EightSided()

    val listResult = listOf<Dice>(fourSided, sixSided, eightSided)
    showAllResult(listResult)
}

fun showAllResult(result: List<Dice>) {
    result.forEach { it.rollDice() }
}

abstract class Dice(val numberOfSides: Int) {
    abstract fun rollDice()
}

class FourSided() : Dice(numberOfSides = 4) {
    override fun rollDice() {
        val resultRollDice = (1..numberOfSides).random()
        println("Брошена кость ($numberOfSides грани), результат броска: $resultRollDice")
    }
}

class SixSided() : Dice(numberOfSides = 6) {
    override fun rollDice() {
        val resultRollDice = (1..numberOfSides).random()
        println("Брошена кость ($numberOfSides граней), результат броска: $resultRollDice")
    }
}

class EightSided() : Dice(numberOfSides = 8) {
    override fun rollDice() {
        val resultRollDice = (1..numberOfSides).random()
        println("Брошена кость ($numberOfSides граней), результат броска: $resultRollDice")
    }
}