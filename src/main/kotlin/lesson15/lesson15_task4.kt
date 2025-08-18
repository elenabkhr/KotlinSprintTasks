package org.example.lesson15

abstract class ProductCategory(
    val title: String,
    val quantity: Int,
)

class Instrument(title: String, quantity: Int) : ProductCategory(title, quantity), AccessorySearch

class AccessoriesInstrument(title: String, quantity: Int) : ProductCategory(title, quantity)

interface AccessorySearch {
    fun searchAccessoriesInstrument() {
        println("Выполняется поиск")
    }
}