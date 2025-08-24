package org.example.lesson20

fun main() {
    val username = "name"
    val greetingUsername: () -> String = { ("С наступающим Новым Годом, $username!") }
    println(greetingUsername())
}