package org.example.lesson16

import kotlin.math.pow

fun main() {
    val circle = Circle(10.0)
    circle.findLength()
    circle.findArea()
}

class Circle(private val radius: Double) {
    private val pi = 3.14

    fun findLength() {
        println(String.format("Длина: %.2f", 2 * pi * radius))
    }

    fun findArea() {
        println(String.format("Площадь: %.2f", pi * radius.pow(2)))
    }
}