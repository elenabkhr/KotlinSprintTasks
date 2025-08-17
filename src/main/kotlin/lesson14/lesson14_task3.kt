package org.example.lesson14

import kotlin.math.pow

const val COLOR_BLACK = "black"
const val COLOR_WHITE = "white"

fun main() {
    val rectangleBlack = Rectangle(COLOR_BLACK, 10.0, 10.0)
    val rectangleWhite = Rectangle(COLOR_WHITE, 20.0, 20.0)

    val circleBlack = Circle(COLOR_BLACK, 10.0)
    val circleWhite = Circle(COLOR_WHITE, 20.0)

    val listFigure: List<Figure> = listOf(rectangleBlack, rectangleWhite, circleBlack, circleWhite)

    var sumBlackPerimeter = 0.0
    var sumWhiteArea = 0.0

    for (i in listFigure) {
        if (i.color == COLOR_BLACK) {
            sumBlackPerimeter += i.calculatePerimeter()
        } else {
            sumWhiteArea += i.calculateArea()
        }
    }

    println(String.format("%.2f", sumBlackPerimeter))
    println(String.format("%.2f", sumWhiteArea))
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