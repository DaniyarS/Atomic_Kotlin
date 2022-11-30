package atomic_kotlin.section_1_2_3.safe_calls_and_elvis

import atomictest.eq

fun main() {
    val s1: String? = "abc"
    (s1 ?: "___") eq "abc"

    val s2: String? = null
    (s2 ?: "___") eq "___"
}