package atomic_kotlin.fifth_chapter

import atomictest.eq

fun main() {
    val array = intArrayOf(4, 5)
    sum(1, 2, 3, *array, 6) eq 21

    val list = listOf(9, 11, 10)

    sum(*list.toIntArray()) eq 30
}