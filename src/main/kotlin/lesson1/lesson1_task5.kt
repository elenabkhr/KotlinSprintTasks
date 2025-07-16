package org.example.lesson1

fun main() {
    val seconds = 6480
    val minutes = 6480/60
    val hours = minutes/60

    val remainingMinutes = minutes % 60
    val remainingSeconds = seconds % 60

    println("0$hours:$remainingMinutes:0$remainingSeconds")
}