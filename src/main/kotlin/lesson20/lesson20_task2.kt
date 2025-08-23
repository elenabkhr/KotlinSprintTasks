package org.example.lesson20

fun main() {
    val player = Player0("player", 5, 10)
    player.reshoreHealth.invoke(player)
}

class Player0(val name: String, var currentHealth: Int, val maxHealth: Int) {
    val reshoreHealth: (Player0) -> Unit = { it: Player0 ->
        currentHealth = maxHealth
        println("Здоровье игрока $name восстановлено. Здоровье сейчас: $currentHealth")
    }
}