package org.example.lesson22

import java.time.LocalDateTime

fun main() {
    val alphaCentauri = GalacticGuide(
        "Alpha Centauri",
        "Тройная звездная система в созведии Центавра",
        LocalDateTime.of(2025, 8, 28, 1, 20, 0),
        4.22,
    )
    println("Название места или события: ${alphaCentauri.component1()}")
    println("Описание места или события: ${alphaCentauri.component2()}")
    println("Дата и время события: ${alphaCentauri.component3()}")
    println("Расстояние места или события от Земли в световых годах: ${alphaCentauri.component4()}")
}

data class GalacticGuide(
    val placeName: String,
    val descriptionPlace: String,
    val eventDataTime: LocalDateTime,
    val distanceFromEarth: Double,
)