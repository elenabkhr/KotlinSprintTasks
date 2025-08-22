package org.example.lesson18

import kotlin.math.pow

open class Package {
    open fun findSurfaceArea(): Double = 0.0
}

class Rectangle(
    private val length: Double,
    private val width: Double,
    private val height: Double,
) : Package() {
    override fun findSurfaceArea(): Double {
        return (2 * (length * width + length * height + width * height))
    }
}

class Cube(private val edgeLength: Double) : Package() {
    override fun findSurfaceArea(): Double {
        return (6 * edgeLength.pow(2))
    }
}