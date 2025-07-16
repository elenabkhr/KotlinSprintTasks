package org.example.lesson2

fun main() {
    val departureTimeHours = 9
    val departureTimeMinutes = 39
    val travelTime = 457

    val travelTimeHours = (departureTimeMinutes + travelTime) / 60
    val arrivalTimeHours = travelTimeHours + departureTimeHours
    val arrivalTimeMinutes = (departureTimeMinutes + travelTime) % 60

    println(String.format("%02d:%02d", arrivalTimeHours, arrivalTimeMinutes))
}