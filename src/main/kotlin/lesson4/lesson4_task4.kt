package org.example.lesson4

fun main() {
    val trainingDay = 5
    val armExercises = trainingDay % 2 != 0
    val absExercises = trainingDay % 2 != 0
    val backExercises = trainingDay % 2 == 0
    val legExercises = trainingDay % 2 == 0

    println(
        "Упражнения для рук: $armExercises\nУпражнения для ног: $absExercises\nУпражнения для спины: $backExercises" +
                "\nУпражнения для пресса: $legExercises"
    )
}