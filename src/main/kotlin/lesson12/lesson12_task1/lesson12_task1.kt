package org.example.lesson12.lesson12_task1

fun main() {
    val weather1 = Weather()
    weather1.daytimeTemperature = "1 день"
    weather1.nightTemperature = "1 ночь"
    weather1.precipitation = true
    weather1.printAll()

    val weather2 = Weather()
    weather2.daytimeTemperature = "2 день"
    weather2.nightTemperature = "2 ночь"
    weather2.precipitation = true
    weather2.printAll()
}

class Weather() {
    var daytimeTemperature = "дневная температура"
    var nightTemperature = "ночная температура"
    var precipitation = false

    fun printAll() {
        println(this.daytimeTemperature)
        println(this.nightTemperature)
        println(this.precipitation)
    }
}