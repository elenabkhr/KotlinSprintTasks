package org.example.lesson16

fun main() {
    val player = Player()
    player.takeDamage()
    player.heal()
    player.takeDamage()
    player.takeDamage()
}

class Player(val name: String = "name", var health: Int = 2, var damage: Int = 1) {
    private var isAlive = true

    fun heal() {
        if (isAlive) {
            health++
            println("Здоровье восстановлено. Количество здоровья: $health")
        }
    }

    fun takeDamage() {
        if (isAlive) {
            health--
            println("Получен урон. Количество здоровья: $health")
            if (health <= 0) die()
        }
    }

    private fun die() {
        println("Игрок умер")
        damage = 0
        health = 0
        isAlive = false
    }
}