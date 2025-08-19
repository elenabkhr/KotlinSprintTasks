package org.example.lesson15

fun main() {
    val temperature = Temperature(10)
    val precipitationAmount = PrecipitationAmount(20)

    val weatherServer = WeatherServer()
    weatherServer.sendMessage(temperature)
    weatherServer.sendMessage(precipitationAmount)
}

class WeatherServer() {
    fun sendMessage(obj: WeatherStationStats) {
        (obj.textMessage())
    }
}

abstract class WeatherStationStats() {
    abstract fun textMessage()
}

class Temperature(val temperature: Int) : WeatherStationStats() {

    override fun textMessage() {
        println("Температура: $temperature")
    }
}

class PrecipitationAmount(val precipitationAmount: Int) : WeatherStationStats() {

    override fun textMessage() {
        println("Количество осадков: $precipitationAmount")
    }
}