package org.example.lesson12

const val KELVIN_IN_CELSIUS4 = 273.15

fun main() {
    val weather1 = _root_ide_package_.org.example.lesson12.Weather4(300, 290, false)
}

class Weather4(daytimeTemperature: Int, nightTemperature: Int, precipitation: Boolean) {
    val daytimeTemperature = daytimeTemperature - KELVIN_IN_CELSIUS4
    val nightTemperature = nightTemperature - KELVIN_IN_CELSIUS4
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
