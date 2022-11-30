package atomic_kotlin.section_4.lambdas_1

import atomictest.eq

fun main() {
    val list = listOf(9, 11, 23, 32)
    val result = list.joinToString(" ") { "[$it]" }

    result eq "[9] [11] [23] [32]"
}
