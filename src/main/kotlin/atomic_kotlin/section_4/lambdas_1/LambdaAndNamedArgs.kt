package atomic_kotlin.section_4.lambdas_1

import atomictest.eq

fun main() {
    val list = listOf(9, 11, 23, 32)

    list.joinToString(
        separator = " ",
        transform = { "[$it]" }
    ) eq "[9] [11] [23] [32]"
}
