package org.example.lesson2

fun main() {
    val averageScore: Double = (3.0 + 4.0 + 3.0 + 5.0) / 4.0
    val FormatAverageScore = String.format("%.2f", averageScore)
    println(FormatAverageScore)
}