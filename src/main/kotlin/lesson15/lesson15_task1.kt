package org.example.lesson15

fun main() {
    val duck = Duck()
    duck.fly()
    duck.float()

    val crucianCarp = CrucianCarp()
    crucianCarp.float()

    val seagull = Seagull()
    seagull.fly()
}

interface Floatable {
    fun float()
}

interface Flyable {
    fun fly()
}

class CrucianCarp() : Floatable {
    override fun float() {
        println("Карась плывет")
    }
}

class Seagull() : Flyable {
    override fun fly() {
        println("Чайка летит")
    }
}

class Duck() : Floatable, Flyable {
    override fun float() {
        println("Утка плывет")
    }

    override fun fly() {
        println("Утка летит")
    }
}