package org.example.lesson17

class Ship(var averageSpeed: Int = 100, var portHome: String = "port1") {
    var name: String = "name"
        set(value) {
            println("Смена имени запрещена")
        }
}