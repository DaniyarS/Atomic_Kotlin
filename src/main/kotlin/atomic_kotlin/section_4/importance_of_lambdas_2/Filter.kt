package atomic_kotlin.section_4.importance_of_lambdas_2

import atomictest.eq

fun main() {
    val list = listOf(1, 2, 3, 4)

    val even = list.filter { it % 2 == 0 }
    val greater2 = list.filter { it > 2 }

    even eq listOf(2, 4)
    greater2 eq listOf(3, 4)
}