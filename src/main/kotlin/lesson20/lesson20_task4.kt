package org.example.lesson20

fun main() {
    val listString = listOf("0", "1", "2", "3", "4")

    val lambdaList1: (List<String>) -> List<() -> Unit> = { str ->
        str.map { it -> { println("Нажат элемент: $it") } }
    }
    val lambdaList2 = lambdaList1(listString)

    lambdaList2.filterIndexed { index, unit -> index % 2 == 0 }
        .forEach { it() }
}