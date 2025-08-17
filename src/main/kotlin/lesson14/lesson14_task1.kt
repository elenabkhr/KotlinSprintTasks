package org.example.lesson14

fun main() {
    val liner = Liner()
    val cargoShip = CargoShip()
    val icebreaker = Icebreaker()
}

open class Liner {
    open val speed: Int = 10
    open val loadCapacity: Int = 10
    open val capacity: Int = 10
    open val passengers: Int = 10
    open val isBreakingIce: Boolean = false
}

class CargoShip : Liner() {
    override val speed: Int = 5
    override val loadCapacity: Int = 15
    override val passengers: Int = 5
}

class Icebreaker : Liner() {
    override val speed: Int = 5
    override val capacity: Int = 5
    override val passengers: Int = 5
    override val isBreakingIce = true
}