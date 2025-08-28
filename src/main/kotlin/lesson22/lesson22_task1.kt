package org.example.lesson22

fun main() {
    val regularBook1 = RegularBook("title", "author")
    val regularBook2 = RegularBook("title", "author")

    val dataBook1 = DataBook("title", "author")
    val dataBook2 = DataBook("title", "author")

    println(regularBook1 == regularBook2)
    println(dataBook1 == dataBook2)
}

/*
В обычном классе по умолчанию оператор сравнения "==\equals" сравнивает ссылки (действует по аналогии с оператором
сравнения ссылок "==="). В data классе equals переопределен по умолчанию, он сравнивает значения
*/

class RegularBook(val title: String, val author: String)

data class DataBook(val title: String, val author: String)
