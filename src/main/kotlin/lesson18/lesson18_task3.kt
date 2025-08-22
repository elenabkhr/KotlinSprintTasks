package org.example.lesson18

fun main() {
    val fox = Fox("fox")
    val dog = Dog("dog")
    val cat = Cat("cat")

    val listAnimals = listOf<Animal>(fox, dog, cat)
    printList(listAnimals)
}

fun printList(listAnimals: List<Animal>) {
    listAnimals.forEach {
        println(it.takeFood())
    }
}

open class Animal {
    open fun takeFood() = ""
    open fun sleep() {}
}

class Fox(
    private val name: String = "",
    private val food: String = "ягода",
) : Animal() {
    override fun takeFood(): String {
        return "$name -> ест \"$food\""
    }
}

class Dog(
    private val name: String = "",
    private val food: String = "кость",
) : Animal() {
    override fun takeFood(): String {
        return "$name -> ест \"$food\""
    }
}

class Cat(
    private val name: String = "",
    private val food: String = "рыба",
) : Animal() {
    override fun takeFood(): String {
        return "$name -> ест \"$food\""
    }
}