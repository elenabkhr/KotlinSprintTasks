package org.example.lesson19

fun main() {
    val tank = Tank()
    tank.shoot()
    tank.changeWeapon(AmmoTypes.BLUE)
    tank.shoot()
    tank.changeWeapon(AmmoTypes.RED)
    tank.shoot()
    tank.changeWeapon(AmmoTypes.GREEN)
    tank.shoot()
}

enum class AmmoTypes(val hitPower: Int) {
    BLUE(5),
    GREEN(10),
    RED(20)
}

class Tank(var ammoTypes: AmmoTypes? = null) {

    fun changeWeapon(ammoTypes: AmmoTypes) {
        this.ammoTypes = ammoTypes
    }

    fun shoot() {
        println("Произведен выстрел. Нанесенный урон: ${ammoTypes?.hitPower ?: 0}")
    }
}