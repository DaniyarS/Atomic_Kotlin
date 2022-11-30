package atomic_kotlin.section_1_2_3.extension_properties_11

import atomictest.eq

fun main() {
    val list: List<*> = listOf(1, 2)
    val any: Any? = list[0]
    any eq 1
}