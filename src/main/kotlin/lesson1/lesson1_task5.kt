package org.example.lesson1

const val SECONDS_IN_MINUTE = 60
const val MINUTE_IN_HOUR = 60

fun main() {
    val seconds = 6480
    val minutes = seconds / SECONDS_IN_MINUTE
    val hours = minutes / MINUTE_IN_HOUR

    val remainingMinutes = minutes % MINUTE_IN_HOUR
    val remainingSeconds = seconds % SECONDS_IN_MINUTE

    val formatTime = String.format("%02d:%02d:%02d;", hours, remainingMinutes, remainingSeconds)
    println(formatTime)
}