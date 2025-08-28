package org.example.lesson22

fun main() {
    val regularBook = RegularBook2("title", "author")
    val dataBook = DataBook2("title", "author")

    println(regularBook)
    println(dataBook)
}

/*
В обычном классе, по умолчанию, метод "toString\print" выводит имя класса и шестнадцатиричное (8 символов) представление
хэш-кода объекта. В data классе этот метод переопределяется автоматически и выводит строкое представление объекта
 */

class RegularBook2(val title: String, val author: String)

data class DataBook2(val title: String, val author: String)
