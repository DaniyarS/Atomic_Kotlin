package withdefaultarguments

import atomictest.eq

// Bad Code:
fun f(n: Int) = n + 373
fun f() = f(0)

fun main() {
    f() eq 373
}
