package atomic_kotlin.third_chapter.exceptions

import atomictest.eq

fun main() {
    "1$".toIntOrNull() eq null
}