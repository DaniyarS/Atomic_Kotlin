package atomic_kotlin.section_4.operations_on_collections_3

import atomictest.eq

fun main() {
    val list = listOf('a', 'b', 'c', 'X', 'Z')
    list.takeLast(3) eq listOf('c', 'X', 'Z')
    list.takeLastWhile { it.isUpperCase() } eq listOf('X', 'Z')

    list.drop(1) eq listOf('b', 'c', 'X', 'Z')
    list.dropWhile { it.isLowerCase() } eq listOf('X', 'Z')
}