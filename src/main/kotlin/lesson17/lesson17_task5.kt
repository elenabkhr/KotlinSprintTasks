package org.example.lesson17

fun main() {
    val user = User("log", "pas")

    user.password = "pppp"
    println(user.password)

    println(user.login)
    user.login = "lllll"
    println(user.login)
}

class User(login: String, password: String) {
    var password: String = password
        set(value) {
            println("Вы не можете изменить пароль")
        }
        get() {
            val hiddenPassword = "*".repeat(field.length)
            return hiddenPassword
        }

    var login: String = login
        set(value) {
            field = value
            println("Логин успешно изменен")
        }
}