package org.example.lesson4

const val SUNNY_WEATHER = true
const val OUTDOOR_AWNING = true
const val AIR_HUMIDITY = 20
const val TIME_OF_YEAR = "winter"

fun main() {
    val weatherToday = true
    val conditionAwning = true
    val nowAirHumidity = 20
    val currentTimeOfYear = "winter"

    val favorableConditions = (SUNNY_WEATHER == weatherToday) && (OUTDOOR_AWNING == conditionAwning) &&
            (AIR_HUMIDITY == nowAirHumidity) && (TIME_OF_YEAR != currentTimeOfYear)

    println("Благоприятные ли условия сейчас для роста бобовых? $favorableConditions")
}