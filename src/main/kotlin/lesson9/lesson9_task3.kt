package org.example.lesson9

fun main() {
    val ingredientCount = listOf(2, 50, 15)

    println("Сколько требуется порций?")
    val servingsCount = readln().toInt()

    println("На $servingsCount порций вам понадобиться: Яиц - ${ingredientCount[0] * servingsCount} шт., " +
            "молока - ${ingredientCount[1] * servingsCount} мл., " +
            "сливочного масла - ${ingredientCount[2] * servingsCount} мл.")
}