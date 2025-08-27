package org.example.lesson22

import java.time.LocalDateTime

fun main() {
    val alphaCentauri = GalacticGuide(
        "Alpha Centauri",
        "Тройная звездная система в созведии Центавра",
        LocalDateTime.of(2025, 8, 28, 1, 20, 0),
        4.22,
    )
    println(alphaCentauri)
}

data class GalacticGuide(
    val placeName: String,
    val descriptionPlace: String,
    val eventDataTime: LocalDateTime,
    val distanceFromEarth: Double,
)