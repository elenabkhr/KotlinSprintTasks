package org.example.lesson_1_10.lesson9

fun main() {
    val ingredientCount = mutableListOf(2, 50, 15)

    println("Сколько требуется порций?")
    val servingsCount = readln().toInt()

    val printIngredientCount = ingredientCount.map { it * servingsCount }

    print("На $servingsCount порций вам понадобиться: ")
    println(
        "Яиц - ${printIngredientCount[0]}, " +
                "молока - ${printIngredientCount[1]}, " +
                "сливочного масла - ${printIngredientCount[2]}."
    )
}