package org.example.lesson_1_10.lesson4

fun main() {
    val trainingDay = 5
    val isEven: Boolean = (trainingDay % 2 == 0)

    println(
        "Упражнения для рук: ${!isEven}\nУпражнения для ног: $isEven\nУпражнения для спины: $isEven" +
                "\nУпражнения для пресса: ${!isEven}"
    )
}