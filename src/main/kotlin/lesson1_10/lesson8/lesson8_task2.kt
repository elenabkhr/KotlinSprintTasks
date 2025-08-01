package org.example.lesson1_10.lesson8

fun main() {
    val pizzaIngredients = arrayOf("Основа из теста", "Бекон", "Сыр", "Томат", "Зелель", "Соус")

    println("Введите ингредиент для поиска: ")
    val ingredientSearch = readln()

    var isIngredientFound = false

    for (i in pizzaIngredients) {
        if (i == ingredientSearch)
            isIngredientFound = true
    }
    if (isIngredientFound == true) println("Ингредиент \"$ingredientSearch\" в рецепте есть.")
    else println("Такого ингредиента в рецепте нет.")
}