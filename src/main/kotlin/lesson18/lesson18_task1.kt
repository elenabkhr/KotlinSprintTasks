package org.example.lesson18

fun main() {
    val order1 = Order(1)
    order1.infoOrder("product")

    val order2 = Order(2)
    order2.infoOrder(listOf("a", "b", "c"))
}

class Order(val number: Int) {

    fun infoOrder(product: String) {
        println("Заказан товар: $product")
    }

    fun infoOrder(productList: List<String>) {
        println("Заказаны следующие товары: ${productList.joinToString()}")
    }
}