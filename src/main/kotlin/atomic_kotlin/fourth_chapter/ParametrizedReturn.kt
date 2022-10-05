package atomic_kotlin.fourth_chapter

import atomictest.eq

fun inferred(p: Char, q: Char) =
    listOf(p, q)

fun explicit(p: Char, q: Char) =
    listOf(p, q)

fun main() {
    inferred('a', 'b') eq "[a, b]"
    explicit('y', 'z') eq "[y, z]"
}