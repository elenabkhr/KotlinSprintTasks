package org.example.lesson_1_10.lesson4

const val NUMBER_OF_TABLES = 13

fun main() {
    val reservedTablesForToday = 13
    val optionToReservedToday = reservedTablesForToday < NUMBER_OF_TABLES

    val reservedTablesForTomorrow = 9
    val optionToReserved = reservedTablesForTomorrow < NUMBER_OF_TABLES

    println("Доступность столиков на сегодня: $optionToReservedToday\n" +
            "Доступность столиков на завтра: $optionToReserved")
}