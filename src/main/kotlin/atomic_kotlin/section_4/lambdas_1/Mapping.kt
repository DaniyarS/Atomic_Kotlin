package atomic_kotlin.section_4.lambdas_1

import atomictest.eq

fun main() {
    val list = listOf('a', 'b', 'c', 'd')

    val result = list.map { "[${it.uppercaseChar()}]" }

    result eq listOf("[A]", "[B]", "[C]", "[D]")
}