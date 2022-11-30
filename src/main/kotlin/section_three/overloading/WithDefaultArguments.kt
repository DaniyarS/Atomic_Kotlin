package section_three.overloading

import atomictest.eq

// It can be replaced with:
fun f(n: Int = 0) = n + 373

fun main() {
    f() eq 373
}
