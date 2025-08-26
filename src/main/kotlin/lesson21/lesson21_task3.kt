package org.example.lesson21

class Player(val name: String, var currentHealth: Int, val maxHealth: Int)

fun Player.isHealthy(): Boolean {
    return currentHealth == maxHealth
}