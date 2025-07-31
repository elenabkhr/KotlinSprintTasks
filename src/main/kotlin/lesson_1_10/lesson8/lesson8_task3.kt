package org.example.lesson_1_10.lesson8

fun main() {
    val pizzaIngredients = arrayOf("Основа из теста", "Бекон", "Сыр", "Томат", "Зелель", "Соус")

    println("Введите ингредиент для поиска: ")
    val ingredientSearch = readln()

    val resultSearch = pizzaIngredients.indexOf(ingredientSearch)

    if (resultSearch >= 0) println("Ингредиент \"$ingredientSearch\" в рецепте есть.")
    else println("Такого ингредиента в рецепте нет.")
}