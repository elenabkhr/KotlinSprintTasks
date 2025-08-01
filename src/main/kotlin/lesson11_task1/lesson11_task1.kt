package org.example.lesson11_task1

fun main() {
    val user1 = User(
        id = 1,
        login = "Anna",
        password = "password111",
        email = "anna111@mail.ru"
    )

    val user2 = User(
        id = 2,
        login = "Maksim",
        password = "password222",
        email = "maksim222@mail.ru"
    )

    println(user1.id)
    println(user1.login)
    println(user1.password)
    println(user1.email)

    println(user2.id)
    println(user2.login)
    println(user2.password)
    println(user2.email)
}

class User(
    val id: Int,
    val login: String,
    val password: String,
    val email: String,
)