package org.example.lesson1_10.lesson10

import kotlin.random.Random

const val USER_LOGIN = "login"
const val USER_PASSWORD = "password"

fun main() {
    println(getCart(authorizeUser("login", "password")))
    println(getCart(authorizeUser("log", "pas")))
}

fun authorizeUser(login: String, password: String): String? {
    var accessToken = ""

    if (login == USER_LOGIN && password == USER_PASSWORD) {
        val rangeLowercaseLetter = 'a'..'z'
        val rangeUppercaseLetter = 'A'..'Z'

        for (i in 1..32) {
            accessToken += (rangeUppercaseLetter + rangeLowercaseLetter +
                    Random.nextInt(0, 9).toString()).random()
        }
        println(accessToken)
        return accessToken

    } else {
        return null
    }
}

fun getCart(accessToken: String?): Any {
    val cartContents = mutableListOf("mirror", "toy", "vase")

    if (accessToken != null) return cartContents
    else return "Неудачная авторизация, данные введены неверно"
}