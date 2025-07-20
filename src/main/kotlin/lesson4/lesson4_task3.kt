package org.example.lesson4

const val IS_SUNNY_WEATHER = true
const val IS_OUTDOOR_AWNING = true
const val AIR_HUMIDITY = 20
const val UNFAVORABLE_TIME_OF_YEAR = "winter"

fun main() {
    val isWeatherSunny = true
    val isAwningOpen = true
    val nowAirHumidity = 20
    val currentTimeOfYear = "winter"

    val favorableConditions = (isWeatherSunny == IS_SUNNY_WEATHER) && (isAwningOpen == IS_OUTDOOR_AWNING) &&
            (nowAirHumidity == AIR_HUMIDITY) && (currentTimeOfYear != UNFAVORABLE_TIME_OF_YEAR)

    println("Благоприятные ли условия сейчас для роста бобовых? $favorableConditions")
}