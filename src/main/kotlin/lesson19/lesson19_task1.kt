package org.example.lesson19

fun main() {
    println(Fish.entries.joinToString(
        prefix = "В аквариум можно добавить: ",
        separator = ", ",
        transform = {it.nameOfFish}
    ))
}

enum class Fish (val nameOfFish: String) {
    GUPPY ("Гуппи"),
    ANGELFISH ("Скалярия"),
    GOLDFISH ("Золотая рыбка"),
    SIAMESE_FIGHTING_FISH ("Петушок")
}