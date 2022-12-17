package atomic_kotlin.section_4.high_order_functions_5

import atomictest.eq

val isPlus: (Int) -> Boolean = { it > 0 }

fun main() {
    listOf(1, 2, -3).any(isPlus) eq true
}