package org.example.lesson21

fun main() {
    val listNumbers = listOf(1, 2, 4, 5, 10)
    println(listNumbers.evenNumbersSum())
}

fun List<Int>.evenNumbersSum(): Int {
    return filter { it % 2 == 0 }.sum()
}