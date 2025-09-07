package org.example.lesson12

fun main() {
    val weather1 = Weather2(
        20,
        10,
        true,
    )
    weather1.printAll()
}

class Weather2(
    val daytimeTemperature: Int,
    val nightTemperature: Int,
    val precipitation: Boolean,
) {

    fun printAll() {
        println(this.daytimeTemperature)
        println(this.nightTemperature)
        println(this.precipitation)
    }
}