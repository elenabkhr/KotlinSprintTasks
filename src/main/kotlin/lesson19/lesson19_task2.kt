package org.example.lesson19

fun main() {
    val product1 = ProductDescription("name1", 1, Product.CLOTHES)
    product1.getProductInfo()

    val product2 = ProductDescription("name2", 2, Product.OFFICE_SUPPLIES)
    product2.getProductInfo()

    val product3 = ProductDescription("name2", 3, Product.DIFFERENT)
    product3.getProductInfo()
}

enum class Product {
    CLOTHES,
    OFFICE_SUPPLIES,
    DIFFERENT;

    fun getCategoryName(): String = when (this) {
        CLOTHES -> "одежда"
        OFFICE_SUPPLIES -> "канцелярские товары"
        DIFFERENT -> "разное"
    }
}

class ProductDescription(val name: String, val id: Int, val category: Product) {
    fun getProductInfo() {
        println("Название: $name, id: $id, категория: ${category.getCategoryName()}")
    }
}