package org.example.lesson9

const val LIST_LENGTH = 5

fun main() {
    val inputIngredientList = mutableListOf<String>()
    println("Введите названия пяти ингредиентов: ")

    for (i in 0 until LIST_LENGTH) {
        println("Введите значение ингредиента ${i + 1}: ")
        val newIngredient = readln().lowercase()
        inputIngredientList.add(i, newIngredient)
    }

    val resultIngredientList =
        inputIngredientList.distinct().sorted().joinToString().replaceFirstChar { it.titlecase() }

    println(resultIngredientList)
}