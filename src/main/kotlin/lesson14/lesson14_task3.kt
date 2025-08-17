package org.example.lesson14

import kotlin.math.pow

fun main() {
    val rectangleBlack = Rectangle("black", 10.0, 10.0)
    val rectangleWhite = Rectangle("white", 20.0, 20.0)

    val circleBlack = Circle("black", 10.0)
    val circleWhite = Circle("white", 20.0)

    val listFigure: List<Figure> = listOf(rectangleBlack, rectangleWhite, circleBlack, circleWhite)

    println(String.format("%.2f", rectangleBlack.calculatePerimeter() + circleBlack.calculatePerimeter()))
    println(String.format("%.2f", rectangleWhite.calculateArea() + circleWhite.calculateArea()))
}

abstract class Figure(val color: String) {
    abstract fun calculateArea(): Double

    abstract fun calculatePerimeter(): Double
}

class Rectangle(
    color: String,
    val width: Double,
    val height: Double,
) : Figure(color) {
    override fun calculateArea(): Double {
        return width * height
    }

    override fun calculatePerimeter(): Double {
        return 2 * (width + height)
    }
}

class Circle(
    color: String,
    val radius: Double,
) : Figure(color) {
    override fun calculateArea(): Double {
        return Math.PI * radius.pow(2)
    }

    override fun calculatePerimeter(): Double {
        return 2 * Math.PI * radius
    }
}