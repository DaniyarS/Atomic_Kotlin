package atomic_kotlin.section_4.lambdas_1

import atomictest.eq

fun main() {
    val list = listOf(1, 2, 3, 4)

    val result = list.map({ n : Int -> "[$n]"})

    result eq listOf("[1]", "[2]", "[3]", "[4]")
}