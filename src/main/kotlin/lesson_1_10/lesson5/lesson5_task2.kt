package org.example.lesson_1_10.lesson5

const val AGE_OF_MAJORITY = 18

fun main() {
    val userBirthYear = readln().toInt()
    val currentYear = 2025
    val userAge = currentYear - userBirthYear

    if (userAge >= AGE_OF_MAJORITY)
        println("Показать экран со скрытым контентом.")
    else if (userAge == 16 || userAge == 17)
        println("Показать экран с ограниченным контентом, например, для товаров с рейтингом 16+")
    else println("Вернуться на главный экран приложения")
}