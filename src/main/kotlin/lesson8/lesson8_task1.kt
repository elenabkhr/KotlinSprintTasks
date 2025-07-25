package org.example.lesson8

fun main() {
    val adViews = arrayOf(10, 30, 40, 20, 35, 15, 30)
    var weeklyAdViews = 0

    for (i in adViews) {
        weeklyAdViews += i
    }
    println(weeklyAdViews)
}