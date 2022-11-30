package atomic_kotlin.section_1_2_3.third_chapter.atomic_test

import atomictest.*

fun main() {
    trace("line 1")
    trace(47)
    trace("line 2")
    trace eq """
        line 1
        47
        line 2
    """
}