package org.example.lesson5

fun main() {
    println("Введите расстояние поездки (в километрах): ")
    val travelDistanceKilometers = readln().toDouble()

    println("Введите расход топлива на 100 км (в литрах): ")
    val fuelConsumption = readln().toDouble()

    println("Введите текущую цену за литр топлива: ")
    val fuelPrice = readln().toDouble()

    val requiredFuel = (travelDistanceKilometers * fuelConsumption) / 100

    val requiredFuelPrice = requiredFuel * fuelPrice

    println(
        String.format(
            "Общее количество необходимого топлива для поездки $requiredFuel\n" +
                    "Итоговая стоимость поездки: %.2f", requiredFuelPrice
        )
    )
}