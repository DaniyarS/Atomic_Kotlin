package atomic_kotlin.section_4.operations_on_collections_3

import atomictest.eq

fun createPair() = Pair(1, "one")

fun main() {
    val (i, s) = createPair()

    i eq 1
    s eq "one"
}