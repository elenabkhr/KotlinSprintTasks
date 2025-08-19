package org.example.lesson15

fun main() {
    val user = RegularUser("name1", 1)
    user.readForum()
    user.writeMessage(user)
    println()

    val administrator = Administrator("name2", 2)
    administrator.deleteUser(user)
    administrator.deleteMessage(user)
}

abstract class User(
    val name: String,
    val id: Int,
) {
    open fun readForum() {
        println("$name читает форум")
    }

    open fun writeMessage(messageId: RegularUser) {
        println("$name написал сообщение №${messageId.id}")
    }
}

class RegularUser(name: String, id: Int) : User(name, id)

class Administrator(name: String, id: Int) : User(name, id) {
    fun deleteUser(regularUser: RegularUser) {
        println("$name удалил пользователя ${regularUser.name}")
    }

    fun deleteMessage(messageId: RegularUser) {
        println("$name удалил сообщение №${messageId.id}")
    }
}