package org.example.lesson1_10.lesson8

fun main() {
    val pizzaIngredients = arrayOf("Основа из теста", "Бекон", "Сыр", "Томат", "Зелель", "Соус")
    println("Список ингредиентов: ${pizzaIngredients.joinToString()}")

    println("Введите название ингредиента, который вы хотите заменить: ")
    val ingredientFound = readln()

    val resultSearch = pizzaIngredients.indexOf(ingredientFound)

    if (resultSearch >= 0) {
        println("Ингредиент \"$ingredientFound\" в рецепте есть.")
        println("Какой ингредиент вы хотите добавить?")
        val ingredientChange = readln()
        pizzaIngredients[resultSearch] = ingredientChange
        println("Готово! Вы сохранили следующий список: ${pizzaIngredients.joinToString()}")

    } else {
        println("Такого ингредиента в рецепте нет.")
    }
}