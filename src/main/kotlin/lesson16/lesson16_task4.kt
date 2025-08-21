package org.example.lesson16

fun main() {
    val order = Order()
    requestOrderChange(order, "delivered")
}

fun requestOrderChange(order: Order, newStatus: String) {
    println("Изменить статус заказа №${order.number}")
    order.changeStatus(newStatus)
    println("Статус заказа изменен на ${order.getStatus()}")
}

class Order(val number: Int = 100, private var status: String = "created") {

    fun getStatus() = status
    private fun setStatus(newStatus: String) {
        status = newStatus
    }

    fun changeStatus(newStatus: String) {
        setStatus(newStatus)
    }
}