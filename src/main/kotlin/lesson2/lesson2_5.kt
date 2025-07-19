package org.example.lesson2
import kotlin.math.pow

fun main() {
    val presentValue = 70000
    val interestRate = 16.7
    val numberOfPeriods = 20

    val futureValue = presentValue * (1 + interestRate/100).pow(numberOfPeriods)
    println(String.format("%.3f",futureValue))
}