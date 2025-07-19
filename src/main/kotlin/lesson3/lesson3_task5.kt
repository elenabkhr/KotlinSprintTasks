package org.example.lesson3

fun main() {
    val receivedData = "D2-D4;0"
    val splitReceivedData = receivedData.split("-", ";")

    val receivedPreviousMove = splitReceivedData[0]
    val receivedNewMove = splitReceivedData[1]
    val receivedMoveNumber = splitReceivedData[2]

    println(receivedPreviousMove)
    println(receivedNewMove)
    println(receivedMoveNumber)
}