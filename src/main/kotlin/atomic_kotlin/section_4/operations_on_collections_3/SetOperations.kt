package atomic_kotlin.section_4.operations_on_collections_3

import atomictest.eq

fun main() {
    val set = setOf("a", "ab", "ac")
    set.maxByOrNull { it.length }?.length eq 2
    set.filter {
        it.contains("b")
    } eq listOf("ab")
    set.map { it.length } eq listOf(1, 2, 2)
}