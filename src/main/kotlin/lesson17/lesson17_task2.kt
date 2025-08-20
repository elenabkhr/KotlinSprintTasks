package org.example.lesson17

class Ship(name: String = "name", val averageSpeed: Int = 100, val portHome: String = "port1") {
    var name: String = name
        set(value) {
            println("Смена имени запрещена")
        }
}