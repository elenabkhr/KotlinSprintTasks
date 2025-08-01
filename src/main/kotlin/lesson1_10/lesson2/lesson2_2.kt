package org.example.lesson1_10.lesson2

fun main() {

    val permanentStaff = 50
    val permanentStaffPayment = 30000
    val interns = 30
    val internPayment = 20000

    val paymentOfAllPermanentStaff = permanentStaff * permanentStaffPayment
    println(paymentOfAllPermanentStaff)

    val paymentOfAllInterns = interns * internPayment
    val totalSalaryExpenses = paymentOfAllPermanentStaff + paymentOfAllInterns
    println(totalSalaryExpenses)

    val currentAverageSalary = totalSalaryExpenses / (permanentStaff + interns)
    println(currentAverageSalary)
}