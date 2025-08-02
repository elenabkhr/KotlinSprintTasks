package org.example.lesson12.lesson12_task4

const val KELVIN_IN_CELSIUS = 273.15

fun main() {
    val weather1 = Weather3(300, 290, false)
}

class Weather3(daytimeTemperature: Int, nightTemperature: Int, precipitation: Boolean) {
    val daytimeTemperature = daytimeTemperature - KELVIN_IN_CELSIUS
    val nightTemperature = nightTemperature - KELVIN_IN_CELSIUS
    val precipitation = precipitation

    init {
        printAll()
    }

    fun printAll() {
        println(String.format("%.2f", this.daytimeTemperature))
        println(String.format("%.2f", this.nightTemperature))
        println(this.precipitation)
    }
}
