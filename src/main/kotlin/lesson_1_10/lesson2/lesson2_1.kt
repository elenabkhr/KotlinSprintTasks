package org.example.lesson_1_10.lesson2

fun main() {

    val numberOfNumbers = 4.0
    val studentAssessment1 = 3.0
    val studentAssessment2 = 4.0
    val studentAssessment3 = 3.0
    val studentAssessment4 = 5.0

    val averageScore: Double = (
            studentAssessment1 + 
            studentAssessment2 + 
            studentAssessment3 +
            studentAssessment4
            ) / numberOfNumbers

    val FormatAverageScore = String.format("%.2f", averageScore)
    println(FormatAverageScore)
}