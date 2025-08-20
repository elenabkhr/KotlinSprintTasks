package org.example.lesson16


fun main() {
    val dice = Dice()
    dice.getValue()
}

class Dice() {
    private val value: Int = (1..6).random()

    fun getValue() {
        println("Число на кубике: $value")
    }
}