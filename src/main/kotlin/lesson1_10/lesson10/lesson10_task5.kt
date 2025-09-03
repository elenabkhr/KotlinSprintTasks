package org.example.lesson1_10.lesson10

const val USER_LOGIN = "login"
const val USER_PASSWORD = "password"

fun main() {
    val token = authorizeUser("login", "password")
    if (token != null) {
        getCart(token)
    } else {
        println("Неудачная авторизация")
    }
}

fun authorizeUser(login: String, password: String): String? {

    if (login == USER_LOGIN && password == USER_PASSWORD) {
        val allChars = ('a'..'z') + ('A'..'Z') + ('0'..'9')
        val accessToken = List(32) { allChars.random() }.joinToString("")
        return accessToken

    } else {
        return null
    }
}

fun getCart(accessToken: String): String {
    val cartContents = listOf("mirror", "toy", "vase").toString()
    return cartContents
}