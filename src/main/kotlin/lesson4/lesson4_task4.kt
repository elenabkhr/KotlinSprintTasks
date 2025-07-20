package org.example.lesson4

fun main() {
    val trainingDay = 5
    val isEven: Boolean = (trainingDay % 2 == 0)

    val armExercises = !isEven
    val absExercises = !isEven
    val backExercises = isEven
    val legExercises = isEven

    println(
        "Упражнения для рук: $armExercises\nУпражнения для ног: $absExercises\nУпражнения для спины: $backExercises" +
                "\nУпражнения для пресса: $legExercises"
    )
}