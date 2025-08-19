package org.example.lesson16

fun main() {
    println("Введите новый номер для заказа:")
    changeNumber(readln().toInt())
}

fun changeNumber(newNumber: Int) {
    val order = Order()
    println("Изменить номер заказа ${order.getNumber()} -> $newNumber")
    order.setNumber(newNumber)
}

class Order(private var number: Int = 100, val status: String = "created") {

    fun getNumber() = number

    fun setNumber(newNumber: Int) {
        number = newNumber
    }
}