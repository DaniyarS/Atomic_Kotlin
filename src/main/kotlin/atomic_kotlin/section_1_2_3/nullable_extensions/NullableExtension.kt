package atomic_kotlin.section_1_2_3.nullable_extensions

import atomictest.eq

fun String?.isNullOrEmpty(): Boolean {
    return this == null || isEmpty()
}

fun main() {
    "".isNullOrEmpty() eq true
}