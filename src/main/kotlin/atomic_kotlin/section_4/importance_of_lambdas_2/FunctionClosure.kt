package atomic_kotlin.section_4.importance_of_lambdas_2

import atomictest.eq

var x = 100

fun useX() {
    x++
}

fun main() {
    useX()
    x eq 101
}