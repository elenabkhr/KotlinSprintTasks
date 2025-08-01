package org.example.lesson1_10.lesson9

import kotlin.collections.sorted

fun main() {
    println("Введите названия ингредиентов блюда: ")
    val userIngredientNames = readln()

    val ingredientNames = userIngredientNames.split(", ")

    val ingredientNamesSorted = ingredientNames.sorted()
    println(ingredientNamesSorted.joinToString())
}