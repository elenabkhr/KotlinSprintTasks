package org.example.lesson14

fun main() {
    val liner = Liner2()
    val cargoShip = CargoShip2()
    val icebreaker = Icebreaker2()

    println(liner)
    println(cargoShip)
    println(icebreaker)

    liner.loadingMethod()
    cargoShip.loadingMethod()
    icebreaker.loadingMethod()
}

open class Liner2 {
    open val speed: Int = 10
    open val loadCapacity: Int = 10
    open val capacity: Int = 10
    open val passengers: Int = 10
    open val isBreakingIce: Boolean = false

    open fun loadingMethod() {
        println("${javaClass.simpleName}: Выдвижение горизонтального трапа со шкафута")
    }

    override fun toString(): String {
        return "${javaClass.simpleName}: Скорость: $speed, грудоподъемность: $loadCapacity, вместимость: $capacity, " +
                "пассижиры: $passengers, возможность колоть лед: $isBreakingIce"

    }
}

class CargoShip2 : Liner2() {
    override val speed: Int = 5
    override val loadCapacity: Int = 15
    override val passengers: Int = 5

    override fun loadingMethod() {
        println("${javaClass.simpleName}: Активация погрузочного крана")
    }
}

class Icebreaker2 : Liner2() {
    override val speed: Int = 5
    override val capacity: Int = 5
    override val passengers: Int = 5
    override val isBreakingIce = true

    override fun loadingMethod() {
        println("${javaClass.simpleName}: Открытие ворот со стороны кормы")
    }
}

//Скопируй классы из предыдущей задачи и измени их названия для избегания конфликтов.

//Каждый тип корабля обладает уникальным способом погрузки:
//- лайнер выдвигает горизонтальный трап со шкафута;
//- грузовой корабль активирует погрузочный кран;
//- ледокол открывает ворота со стороны кормы.

//Реализуй методы погрузки, специфичные для каждого вида корабля.
//Добавь метод вывода информации о свойствах корабля и выведи информацию в консоль.
