package org.example.lesson17

fun main() {
    val package1 = Package1()

    println(package1.location)
    println(package1.count)
    package1.location = "newLocation"
    println(package1.count)
    println(package1.location)
}

class Package1(val id: Int = 1, location: String = "location") {
    var count = 0

    var location: String = location
        set(value) {
            field = value
            count++
        }
}