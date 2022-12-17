package atomic_kotlin.section_4.high_order_functions_5

import atomictest.trace

fun main() {
    repeat(4) { trace("hi!") }
    trace eq "hi! hi! hi! hi!"
}