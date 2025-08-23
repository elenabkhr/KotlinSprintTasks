package org.example.lesson20

fun main() {
    val username = "name"
    val printUsername: () -> Unit = { println("С наступающим Новым Годом, $username!") }
    printUsername()
}