package org.example.lesson11

fun main() {
    val user1 = User2(
        id = 1,
        login = "Anna",
        password = "password111",
        email = "anna111@mail.ru",
        bio = null,
    )

    user1.addBio()
    user1.changePassword()
    user1.viewInformation()
}

class User2(
    val id: Int,
    val login: String,
    var password: String,
    val email: String,
    var bio: String?
) {

    fun viewInformation() {
        println("Информаиця о пользователе: ")
        println(id)
        println(login)
        println(password)
        println(email)
        println(bio)
    }

    fun addBio() {
        println("Расскажите о себе: ")
        val inputBio = readln()
        bio = inputBio
        println("Биография сохранена")
    }

    fun changePassword() {
        println("Введите текущий пароль: ")
        val inputPassword = readln()
        if (inputPassword == password) {
            println("Введите новый пароль: ")
            val newPassoword = readln()
            password = newPassoword
            println("Пароль изменен")
        } else {
            println("Пароль введен неверно")
        }
    }
}