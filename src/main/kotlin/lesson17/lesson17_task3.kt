package org.example.lesson17

fun main() {
    val folder = Folder()
    println(folder.infoName)
}

class Folder(val name: String = "name", numberFile: Int = 5, val isSecret: Boolean = true) {

    val numberFile: Int = numberFile
        get() = if (isSecret) 0 else field

    val infoName: String
        get() =
            if (isSecret) {
                "Скрытая папка"
            } else {
                "Название: $name, количество файлов: $numberFile"
            }
}