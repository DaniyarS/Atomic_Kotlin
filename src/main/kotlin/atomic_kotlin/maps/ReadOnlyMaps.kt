package atomic_kotlin.maps

import atomictest.eq

fun main() {
    val m = mapOf(5 to "five", 6 to "six")
    m[5] eq "five"

    m + (4 to "four")
    m eq mapOf(5 to "five", 6 to "six")
    val m2 = m + (4 to "four")
    m2 eq mapOf(4 to "four", 5 to "five", 6 to "six")
}