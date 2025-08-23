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

abstract class Animal(val name: String) {
    abstract fun takeFood(): String
    open fun sleep(): String {
        return "$name -> спит"
    }
}

class Fox(
    name: String,
    private val food: String = "ягода",
) : Animal(name) {
    override fun takeFood(): String {
        return "$name -> ест \"$food\""
    }
}

class Dog(
    name: String,
    private val food: String = "кость",
) : Animal(name) {
    override fun takeFood(): String {
        return "$name -> ест \"$food\""
    }
}

class Cat(
    name: String,
    private val food: String = "рыба",
) : Animal(name) {
    override fun takeFood(): String {
        return "$name -> ест \"$food\""
    }
}