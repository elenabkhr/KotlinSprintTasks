package org.example.lesson5

import kotlin.math.pow

const val CENTIMETERS_IN_METER = 100
const val BMI_1 = 18.5
const val BMI_2 = 25
const val BMI_3 = 30

fun main() {
    println("Введите свой вес (в килограммах): ")
    val userWeight = readln().toDouble()

    println("Введите свой рост (в сантиметрах): ")
    val userHeightCentimeters = readln().toDouble()

    val userHeightMeters = userHeightCentimeters / CENTIMETERS_IN_METER

    val userBMI = userWeight / userHeightMeters.pow(2)

    val userResultBMI = when {
        userBMI < BMI_1 -> "Недостаточная масса тела"
        userBMI >= BMI_1 && userBMI < BMI_2 -> "Нормальная масса тела"
        userBMI >= BMI_2 && userBMI < BMI_3 -> "Избыточная масса тела"
        else -> "Ожирение"
    }
    println(String.format("Индекс массы тела: %.2f.\nКатегория веса: $userResultBMI.", userBMI))
}