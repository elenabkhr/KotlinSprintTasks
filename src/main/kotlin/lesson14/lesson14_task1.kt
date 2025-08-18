package org.example.lesson14

fun main() {
    val liner = Liner("Лайнер1")
    val cargoShip = CargoShip("Грузовой1")
    val icebreaker = Icebreaker("Ледокол1")
}

open class Liner(
    val name: String,
    open val speed: Int = 10,
    open val cargoCapacity: Int = 10,
    open val passengerCapacity: Int = 15,
)

class CargoShip(
    name: String,
) : Liner(name = name, speed = 5, cargoCapacity = 15, passengerCapacity = 10)

class Icebreaker(
    name: String,
    val isBreakingIce: Boolean = true,
) : Liner(name = name , speed = 5, cargoCapacity = 10, passengerCapacity = 5)