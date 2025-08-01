package org.example.lesson1_10.lesson4

const val MAX_NUMBER_OF_PERSON = 70
const val MIN_NUMBER_OF_PERSON = 55
const val RECOMMEND_BOXES_OF_PROVISIONS = 50

fun main() {
    println("Имеет ли корабль повреждения?")
    val hasDamage = readln().toBoolean()

    println("Какое число экипажа корабля?")
    val numberOfPerson = readln().toInt()

    println("Какое число ящиков провизии?")
    val boxesOfProvisions = readln().toInt()

    println("Благоприятная ли погода?")
    val hasFavorableWeather = readln().toBoolean()

    if ((!hasDamage &&
                numberOfPerson in MIN_NUMBER_OF_PERSON..MAX_NUMBER_OF_PERSON &&
                boxesOfProvisions > RECOMMEND_BOXES_OF_PROVISIONS
                ) ||
        (hasDamage &&
                numberOfPerson == MAX_NUMBER_OF_PERSON &&
                hasFavorableWeather &&
                boxesOfProvisions >= RECOMMEND_BOXES_OF_PROVISIONS
                )
    ) {
        println("Корабль может отправиться в плавание.")
    } else {
        println("Корабль не может отправиться в плавание.")
    }
}