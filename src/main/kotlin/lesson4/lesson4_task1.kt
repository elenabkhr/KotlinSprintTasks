package org.example.lesson4
const val NUMBER_OF_TABLES = 13

fun main() {
    var reservedTablesForToday = 13
    var optionToReservedToday = reservedTablesForToday != NUMBER_OF_TABLES

    var reservedTablesForTomorrow = 9
    var optionToReserved = reservedTablesForTomorrow != NUMBER_OF_TABLES

    println("Доступность столиков на сегодня: $optionToReservedToday\n" +
            "Доступность столиков на завтра: $optionToReserved")
}