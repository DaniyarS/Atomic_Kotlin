package atomic_kotlin.section_1_2_3.third_chapter.exceptions

import atomictest.*

fun main() {
    capture {
        "1$".toInt()
    } eq "NumberFormatException: " +
            """For intput string: "1$""""
}