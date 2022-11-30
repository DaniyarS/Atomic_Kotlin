package atomic_kotlin.section_1_2_3.destructing_declarations

import atomictest.eq

fun main() {
    val (value, description) = compute(7)
    value eq 14
    description  eq "High"
}