package atomic_kotlin.section_1_2_3.fourth_chapter

import atomictest.capture

fun main() {
    val ints = listOf(1, 2, 3)

    capture {
        ints[3]
    } contains listOf("ArrayIndexOutOfBoundsException")
}