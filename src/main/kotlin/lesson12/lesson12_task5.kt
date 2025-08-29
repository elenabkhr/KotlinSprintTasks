package org.example.lesson12

import kotlin.random.Random

const val KELVIN_IN_CELSIUS = 273.15

fun main() {
    val randomWeatherList = mutableListOf<Weather5>()

    for (i in 1..30) {
        val daytimeTemperature = Random.nextInt(290, 320)
        val nightTemperature = Random.nextInt(280, 310)
        val precipitation = Random.nextBoolean()
        randomWeatherList.add(Weather5(daytimeTemperature, nightTemperature, precipitation))
    }

    val dayTemp = randomWeatherList.map { it.daytimeTemperature }
    val nightTemp = randomWeatherList.map { it.nightTemperature }

    val hasPrecipitation = randomWeatherList.map { it.precipitation } //true
    val numberDaysPrecipitation = hasPrecipitation.count { it }

    println(String.format("%.2f", dayTemp.average()))
    println(String.format("%.2f", nightTemp.average()))
    println(String.format("%2d", numberDaysPrecipitation))
}

class Weather5(daytimeTemperature: Int, nightTemperature: Int, precipitation: Boolean) {
    val daytimeTemperature = daytimeTemperature - KELVIN_IN_CELSIUS
    val nightTemperature = nightTemperature - KELVIN_IN_CELSIUS
    val precipitation = precipitation
}
/*

Продолжи усовершенствовать программу, теперь она должна рассчитывать средние значения температур
и считать количество дней с осадками за месяц.

Представь, что данные ты получаешь от датчиков. Сымитируй их поведение с помощью random.

- в функции main() создай список и добавь в него с помощью цикла 30 объектов класса,
передав в конструкторы случайные значения;

- извлеки из списка дневные и ночные температуры, используя функцию map, а также посчитай количество дней с осадками;

- вычисли средние значения дневных и ночных температур с помощью специальной extension-функции из стандартной библиотеки;

- посчитай количество дней с осадками.

Выведи результаты в консоль.

 */