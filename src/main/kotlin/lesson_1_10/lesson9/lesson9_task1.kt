package org.example.lesson_1_10.lesson9

fun main() {
    val friedEggs = listOf("Яйцо", "Масло", "Соль")
    println("В рецепте есть следующие ингредиенты:")
    friedEggs.forEach { it ->
        println(it)
    }
}