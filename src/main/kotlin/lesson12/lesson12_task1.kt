package org.example.lesson12

fun main() {
    val weather1 = Weather()
    weather1.daytimeTemperature = 15
    weather1.nightTemperature = 10
    weather1.precipitation = true
    weather1.printAll()

    val weather2 = Weather()
    weather2.daytimeTemperature = 10
    weather2.nightTemperature = 5
    weather2.precipitation = true
    weather2.printAll()
}

class Weather() {
    var daytimeTemperature = 0
    var nightTemperature = 0
    var precipitation = false

    fun printAll() {
        println(this.daytimeTemperature)
        println(this.nightTemperature)
        println(this.precipitation)
    }
}