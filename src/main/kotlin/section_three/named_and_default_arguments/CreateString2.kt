package section_three.named_and_default_arguments

import atomictest.eq

fun main() {
    val list = listOf(1, 2, 3)
    list.joinToString(". ", "", "!") eq "1. 2. 3!"
    list.joinToString(separator = ". ", postfix = "!") eq "1. 2. 3!"
}