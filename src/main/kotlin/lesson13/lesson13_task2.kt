package org.example.lesson13

fun main() {
    val phone1 = PhoneDirectory2(
        "Ростислав",
        89123456789,
    )
    phone1.printInformation()
}

class PhoneDirectory2(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null ?: "<не указано>"
) {
    fun printInformation() {
        println("- Имя: $name\n- Номер: $phoneNumber\n- Компания: $company")
    }
}