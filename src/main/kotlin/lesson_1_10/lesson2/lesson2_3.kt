package org.example.lesson_1_10.lesson2
const val MINUTES_IN_HOUR = 60

fun main() {
    val departureTimeHours = 9
    val departureTimeMinutes = 39
    val travelTime = 457

    val travelTimeHours = (departureTimeMinutes + travelTime) / MINUTES_IN_HOUR
    val arrivalTimeHours = travelTimeHours + departureTimeHours
    val arrivalTimeMinutes = (departureTimeMinutes + travelTime) % MINUTES_IN_HOUR

    println(String.format("%02d:%02d", arrivalTimeHours, arrivalTimeMinutes))
}