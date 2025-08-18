package org.example.lesson15

fun main() {
    val weatherServer1 = WeatherServer()
    weatherServer1.sendMessage(Temperature)
    weatherServer1.sendMessage(PrecipitationAmount)
}

class WeatherServer {
    fun sendMessage(obj: WeatherStationStats) {
            (obj.textMessage())
    }
}

abstract class WeatherStationStats() {
    abstract fun textMessage ()
}

object Temperature : WeatherStationStats() {
    val temperature = 10

    override fun textMessage() {
        println("Температура: $temperature")
    }
}

object PrecipitationAmount : WeatherStationStats() {
    val precipitationAmount = 20

    override fun textMessage() {
        println("Количество осадков: $precipitationAmount")
    }
}