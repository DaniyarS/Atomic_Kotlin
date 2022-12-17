package atomic_kotlin.section_4.high_order_functions_5

import atomictest.eq

val helloWorld: () -> String =
    { "Hello, World!" }

val sum: (Int, Int) -> Int = { x, y -> x + y}

fun main() {
    helloWorld() eq "Hello, World!"
    sum(1, 2) eq 3
}