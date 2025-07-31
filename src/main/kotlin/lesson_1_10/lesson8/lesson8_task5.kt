package org.example.lesson_1_10.lesson8

fun main() {
    println("Введите длину массива: ")
    val lengthArray = readln().toInt()

    val ingredientArray = arrayOfNulls<String>(lengthArray)

    for (i in 0 until lengthArray) {
        println("Введите ингредиент: ")
        val newIngredient = readln()
        ingredientArray[i] = newIngredient
    }
    println("Введенные ингредиенты: ${ingredientArray.joinToString()}")
}