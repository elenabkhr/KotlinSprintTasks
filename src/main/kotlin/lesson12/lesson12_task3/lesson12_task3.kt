package org.example.lesson12.lesson12_task3

const val KELVIN_IN_CELSIUS = 273.15

fun main() {
    val weather1 = Weather3(300, 290, false)
    weather1.printAll()
}

class Weather3(daytimeTemperature: Int, nightTemperature: Int, precipitation: Boolean) {
    val daytimeTemperature = daytimeTemperature - KELVIN_IN_CELSIUS
    val nightTemperature = nightTemperature - KELVIN_IN_CELSIUS
    val precipitation = precipitation

    fun printAll() {
        println(String.format("%.2f", this.daytimeTemperature))
        println(String.format("%.2f", this.nightTemperature))
        println(this.precipitation)
    }
}