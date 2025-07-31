package org.example.lesson_1_10.lesson4

const val MIN_WEIGHT = 35
const val MAX_WEIGHT = 100
const val MAX_VOLUME = 100

fun main() {
    val cargoWeight1 = 20
    val cargoVolume1 = 80
    println(
        "Груз с весом $cargoWeight1 кг и объемом $cargoVolume1 л соответствует категории 'Average': " +
                "${(cargoWeight1 > MIN_WEIGHT) && (cargoWeight1 <= MAX_WEIGHT) && (cargoVolume1 < MAX_VOLUME)}"
    )

    val cargoWeight2 = 50
    val cargoVolume2 = 100
    println(
        "Груз с весом $cargoWeight2 кг и объемом $cargoVolume2 л соответствует категории 'Average': " +
                "${(cargoWeight2 > MIN_WEIGHT) && (cargoWeight2 <= MAX_WEIGHT) && (cargoVolume2 < MAX_VOLUME)}"
    )
}