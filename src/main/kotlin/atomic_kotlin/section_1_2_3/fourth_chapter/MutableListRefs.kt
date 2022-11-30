package atomic_kotlin.section_1_2_3.fourth_chapter

import atomictest.eq

fun main() {
    val first = mutableListOf(1)
    val second: List<Int> = first

    first += 2

    second eq listOf(1, 2)
}