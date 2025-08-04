package org.example.lesson13

fun main() {
    val listContact = listOf(
        PhoneDirectory3("Name1", 89123456111),
        PhoneDirectory3("Name2", 89123456222),
        PhoneDirectory3("Name3", 89123456333, null),
        PhoneDirectory3("Name4", 89123456444, "company4"),
        PhoneDirectory3("Name5", 89123456555, "company5")
    )
    val listContactNotNull = listContact.mapNotNull {
        if (it.company != null && it.company != "<не указано>")
            it else null
    }

    for (i in listContactNotNull) {
        println(i.company)
    }
}

class PhoneDirectory3(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null ?: "<не указано>"
)