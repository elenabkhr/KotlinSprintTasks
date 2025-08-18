package org.example.lesson15

fun main() {
    val user = StandardUser("name1", 1)
    user.readForum()
    user.writeMessage()

    val administrator = Administrator("name2", 2)
    administrator.readForum()
    administrator.writeMessage()
    administrator.deleteUser()
    administrator.deleteMessage()
}

abstract class User(
    val name: String,
    val id: Int,
) {
    open fun readForum() {
        println("Читать форум")
    }

    open fun writeMessage() {
        println("Написать сообщение")
    }
}

class StandardUser(name: String, id: Int) : User(name, id)

class Administrator(name: String, id: Int) : User(name, id) {
    fun deleteUser() {
        println("Удалить пользователя")
    }

    fun deleteMessage() {
        println("Удалить сообщение")
    }
}