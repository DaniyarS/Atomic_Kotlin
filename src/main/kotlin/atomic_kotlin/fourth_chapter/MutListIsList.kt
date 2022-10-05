package atomic_kotlin.fourth_chapter

import atomictest.eq

fun getList(): List<Int> {
    return mutableListOf(1, 2, 3)
}

fun main() {
    val list = getList()

    list eq listOf(1, 2, 3)
}