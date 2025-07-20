package org.example.lesson4

fun main() {
    val hasDamage = readln().toBoolean()
    val numberOfPerson = readln().toInt()
    val boxesOfProvisions = readln().toInt()
    val hasFavorableWeather = readln().toBoolean()

    if (!hasDamage) {
        if ((numberOfPerson in 55..71) && (boxesOfProvisions > 50)) {
            println("Корабль может отправиться в плавание.")
        } else {
            println("Корабль не может отправиться в плавание.")
        }
    } else {
        if ((numberOfPerson == 70) && (boxesOfProvisions >= 50) && (hasFavorableWeather)) {
            println("Корабль может отправиться в плавание.")
        } else {
            println("Корабль не может отправиться в плавание.")
        }
    }
}