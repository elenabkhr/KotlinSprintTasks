package org.example.lesson9

fun main() {
    val friedEggs = mutableListOf("Яйцо", "Масло", "Соль")

    println("В рецепте есть базовые ингредиенты:")
    friedEggs.forEach { it ->
        println(it)
    }

    do {
        println("Желаете добавить еще?")
        val userInputFirst = readln()

        if (userInputFirst.equals("нет", ignoreCase = true)) {
            break
        } else {
            println("Какой ингредиент вы хотите добавить?")
            val userInputSecond = readln()
            var isIngredientFound = true

            for (i in friedEggs) {
                if (i.equals(userInputSecond, ignoreCase = true)) {
                    isIngredientFound = true
                } else {
                    isIngredientFound = false
                }
            }
            if (isIngredientFound == true) println("Ингредиент уже есть в списке")
            else {
                (friedEggs.add(userInputSecond))
                println("Теперь в рецепте есть следующие ингредиенты: ${friedEggs.joinToString()}")
            }
        }
    } while (userInputFirst.equals("да", ignoreCase = true))
}