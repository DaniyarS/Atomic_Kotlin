package atomic_kotlin.section_4.lambdas_1

import atomictest.eq

fun main() {
    val list = listOf('a', 'b', 'c')

    list.mapIndexed { index, c ->
        "[$index: $c]"
    } eq listOf("[0: a]", "[1: b]", "[2: c]")

}