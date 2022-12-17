package atomic_kotlin.section_4.high_order_functions_5

import atomictest.trace

fun repeat(
    times: Int,
    action: (String) -> Unit
) {
    for (index in 0 until times) {
        action(index.plus(index * index).toString())
    }
}

fun main() {
    repeat(3) { trace("#$it") }
    trace eq "#0 #1 #2"
}