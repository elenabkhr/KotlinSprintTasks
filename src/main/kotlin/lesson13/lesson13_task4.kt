package org.example.lesson13

fun main() {
    val listContact = listOf(
        PhoneDirectory4("Name1"),
        PhoneDirectory4("Name2", "89123456222"),
        PhoneDirectory4("Name3", "891234563rejrk", null),
        PhoneDirectory4("Name4", company = "company4"),
        PhoneDirectory4("Name5", "89123456555", "company5")
    )
    for (i in listContact) {
        i.printListContactNotNull()
    }
}

class PhoneDirectory4(
    val name: String,
    val phoneNumber: String? = null,
    val company: String? = null,
) {
    fun printListContactNotNull() {
        val phoneNumberLong = this.phoneNumber?.toLongOrNull()
        if (phoneNumberLong == null) {
            println("Не добавлен номер телефона")
        } else {
            println("${this.name}, $phoneNumberLong, ${this.company}")
        }
    }
}