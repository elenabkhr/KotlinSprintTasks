package org.example.lesson2

fun main() {
    val permanentStaffPayment = 50 * 30000
    println(permanentStaffPayment)

    val internPay = 30 * 20000
    val totalSalaryExpenses = permanentStaffPayment + internPay
    println(totalSalaryExpenses)

    val currentAverageSalary = totalSalaryExpenses / (30 + 50)
    println(currentAverageSalary)
}