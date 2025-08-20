package org.example.lesson17

fun main() {
    val folder = Folder()
    println(folder.name)
}

class Folder(name: String = "name", var numberFile: Int = 5, val isSecret: Boolean = true) {

    var name: String = name
        get() {
            return if (isSecret) {
                "Скрытая папка"
                numberFile = 0
                "Количество файлов: $numberFile"

            } else {
                "Название: $field, количество файлов: $numberFile"
            }
        }
}