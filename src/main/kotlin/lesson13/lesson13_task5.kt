package org.example.lesson13

import kotlin.NumberFormatException

fun main() {
    val phone1 = PhoneDirectory5(
        "name",
        "number",
        company = "company"
    )
}

class PhoneDirectory5(
    val name: String,
    val phoneNumber: String,
    val company: String,
) {
    init {
        try {
            this.phoneNumber.toLong()
        } catch (e: NumberFormatException) {
            println("Ошибка: NumberFormatException")
        }
    }
}