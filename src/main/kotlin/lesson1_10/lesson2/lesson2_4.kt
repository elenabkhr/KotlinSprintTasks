package org.example.lesson1_10.lesson2

fun main() {
    val crystalOre = 7
    val ironOre = 11
    val oreBonus = 20

    val crystalOreBonus = (crystalOre * (oreBonus / 100.0))
    val ironOreBonus = (ironOre * (oreBonus / 100.0))

    println(String.format("Кристаллическая руда: %.0f", crystalOreBonus))
    println(String.format("Железная руда: %.0f", ironOreBonus))
}
