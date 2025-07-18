package org.example.lesson2

fun main() {
    val crystalOre = 7
    val ironOre = 11
    val oreBonus = 0.2

    val crystalOreBonus = (crystalOre * oreBonus)
    val ironOreBonus= (ironOre * oreBonus)

    println(String.format("Кристаллическая руда: %.0f", crystalOreBonus))
    println(String.format("Железная руда: %.0f", ironOreBonus))
}
