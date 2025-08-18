package org.example.lesson14

fun main() {
    val liner = Liner2("Лайнер2")
    val cargoShip = CargoShip2("Грузовой2")
    val icebreaker = Icebreaker2("Ледокол2")

    println(liner)
    println(cargoShip)
    println(icebreaker)

    liner.loadCargo()
    cargoShip.loadCargo()
    icebreaker.loadCargo()
}

open class Liner2(
    val name: String,
    open val speed: Int = 10,
    open val cargoCapacity: Int = 10,
    open val passengerCapacity: Int = 15,
) {
    open fun loadCargo() {
        println("$name: Выдвижение горизонтального трапа со шкафута")
    }

    override fun toString(): String {
        return "$name: Скорость: $speed, грудоподъемность: $cargoCapacity, " +
                "вместимость: $passengerCapacity"

    }
}

class CargoShip2(
    name: String,
    override val speed: Int = 5,
    override val cargoCapacity: Int = 15,
    override val passengerCapacity: Int = 10,
) : Liner2(name, speed, cargoCapacity, passengerCapacity) {

    override fun loadCargo() {
        println("$name: Активация погрузочного крана")
    }
}

class Icebreaker2(
    name: String,
    override val speed: Int = 5,
    override val cargoCapacity: Int = 10,
    override val passengerCapacity: Int = 5,
    val isBreakingIce: Boolean = true,
) : Liner2(name, speed, cargoCapacity, passengerCapacity) {

    override fun loadCargo() {
        println("$name: Открытие ворот со стороны кормы")
    }

    override fun toString(): String {
        return "$name: Скорость: $speed, грудоподъемность: $cargoCapacity, вместимость: $passengerCapacity, " +
                "возможность колоть лед: $isBreakingIce"

    }
}