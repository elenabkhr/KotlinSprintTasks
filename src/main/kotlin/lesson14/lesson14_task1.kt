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
    override val speed: Int = 5,
    override val cargoCapacity: Int = 15,
    override val passengerCapacity: Int = 10,
) : Liner(name, speed, cargoCapacity, passengerCapacity)

class Icebreaker(
    name: String,
    override val speed: Int = 5,
    override val cargoCapacity: Int = 10,
    override val passengerCapacity: Int = 5,
    val isBreakingIce: Boolean = true,
) : Liner(name, speed, cargoCapacity, passengerCapacity)