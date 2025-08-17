package org.example.lesson14

fun main() {
    val satellite1 = Satellite("Спутник1", true, true)
    val satellite2 = Satellite("Спутник2", false, true)

    val planet = Planet(true, false, "Планета1")

    planet.satellites.add(satellite1)
    planet.satellites.add(satellite2)

    println("Планета: ${planet.name}. Спутники: ${planet.satellites.joinToString { it.name }}")
}

abstract class CelestialBody(
    val name: String,
    val hasAtmosphere: Boolean,
    val isSuitableForLanding: Boolean,
)

open class Planet(
    hasAtmosphere: Boolean,
    isSuitableForLanding: Boolean,
    name: String,
) : CelestialBody(name, hasAtmosphere, isSuitableForLanding) {
    val satellites: MutableList<Satellite> = mutableListOf()
}

class Satellite(
    name: String,
    hasAtmosphere: Boolean,
    isSuitableForLanding: Boolean,
) : CelestialBody(name, hasAtmosphere, isSuitableForLanding)