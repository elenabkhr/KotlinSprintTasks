package org.example.lesson22

fun main() {
    val person = Person("Anya", 20, "Moscow")

    val (name, age, city) = person
    println("name: $name, age: $age, city: $city")
}

data class Person(val name: String, val age: Int, val city: String)
