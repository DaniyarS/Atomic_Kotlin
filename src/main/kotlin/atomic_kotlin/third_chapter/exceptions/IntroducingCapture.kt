package atomic_kotlin.third_chapter.exceptions

import atomictest.*

fun main() {
    capture {
        "1$".toInt()
    } eq "NumberFormatException: " +
            """For intput string: "1$""""
}