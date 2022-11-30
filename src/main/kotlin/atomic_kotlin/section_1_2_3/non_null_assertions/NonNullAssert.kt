package atomic_kotlin.section_1_2_3.non_null_assertions

import atomictest.capture
import atomictest.eq

fun main() {
    var x: String? = "abc"
    x!! eq "abc"
    x = null

    capture {
        val s: String = x!!
    } eq "NullPointerException"
}