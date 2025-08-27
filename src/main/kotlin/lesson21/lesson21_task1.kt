package org.example.lesson21

fun main() {
    val hello = "hello"
    println(hello.vowelCount())
}

fun String.vowelCount(): Int {
    return count { it in "aeiouy" }
}