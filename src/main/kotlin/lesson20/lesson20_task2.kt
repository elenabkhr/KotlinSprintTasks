package org.example.lesson20

fun main() {
    val player = Player("player", 5, 10)
    player.reshoreHealth.invoke(player)
}

class Player(val name: String, var currentHealth: Int, val maxHealth: Int) {
    val reshoreHealth: (Player) -> Unit = { it ->
        currentHealth = maxHealth
        println("Здоровье игрока $name восстановлено. Здоровье сейчас: $currentHealth")
    }
}