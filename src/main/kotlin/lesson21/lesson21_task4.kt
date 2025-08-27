package org.example.lesson21

import java.io.File

fun main() {
    val file = File("textFile.txt")
    file.createNewFile()
    file.writeWordToFile()
}

fun File.writeWordToFile() {
    val copyFile = File("copyFile.txt")
    this.copyTo(copyFile, true)

    this.writeText(readln().lowercase() + "\n")

    this.appendText(copyFile.readText())
}