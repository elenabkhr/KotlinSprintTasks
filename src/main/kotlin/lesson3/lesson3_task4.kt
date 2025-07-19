package org.example.lesson3

fun main() {
    var previousMove = "E2"
    var newMove = "E4"
    var moveNumber = 1

    var sentData = "$previousMove-$newMove;$moveNumber"
    println(sentData)

    previousMove = "D2"
    newMove = "D3"
    moveNumber ++

    sentData = "$previousMove-$newMove;$moveNumber"
    println(sentData)
}