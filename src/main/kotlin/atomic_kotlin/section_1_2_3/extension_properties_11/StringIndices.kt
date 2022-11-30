package atomic_kotlin.section_1_2_3.extension_properties_11

import atomictest.eq

val String.indices: IntRange
    get() = 0 until length

fun main() {
    "abc".indices eq 0 .. 2
}
