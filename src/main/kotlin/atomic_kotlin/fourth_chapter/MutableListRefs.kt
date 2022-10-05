package atomic_kotlin.fourth_chapter

import atomictest.eq

fun main() {
    val first = mutableListOf(1)
    val second: List<Int> = first

    first += 2

    second eq listOf(1, 2)
}