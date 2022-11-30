package atomic_kotlin.section_1_2_3.nullable_types

import atomictest.eq

fun main() {
    val s1: String = "abc"
    val s2: String? = s1

    s1.length eq 3
    //s2.length
}