package org.example.lesson20

class Player3(val hasKey: Boolean) {
    val checkKey: (Player3) -> String = { player ->
        if (hasKey) "Игрок открыл дверь"
        else "Дверь заперта"
    }
}