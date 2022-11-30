package atomic_kotlin.section_4.operations_on_collections_3

import atomictest.eq

fun main() {
    val list = listOf(1, 2, null)
    list.filterNotNull() eq listOf(1, 2)
}
