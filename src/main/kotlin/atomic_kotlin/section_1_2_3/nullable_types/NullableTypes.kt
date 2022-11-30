package atomic_kotlin.section_1_2_3.nullable_types

import atomictest.eq

fun main() {
    val s1 = "abc"

    val s3: String? = null
    val s4: String? = s1

    val s6 = s4

    s1 eq "abc"
    s3 eq null
    s4 eq "abc"
    s6 eq "abc"
}