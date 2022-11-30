package atomic_kotlin.section_1_2_3.fourth_chapter

import atomictest.eq

fun main() {
    val list = mutableListOf<Int>()

    list.add(1)
    list.addAll(listOf(2, 3))

    list += 4
    list += listOf(5, 6)

    list eq listOf(1, 2, 3, 4, 5, 6)
}