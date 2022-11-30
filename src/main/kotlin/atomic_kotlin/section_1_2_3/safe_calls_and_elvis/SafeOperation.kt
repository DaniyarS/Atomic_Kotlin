package atomic_kotlin.section_1_2_3.safe_calls_and_elvis

import atomictest.trace

fun String.echo() {
    trace(toUpperCase())
    trace(this)
    trace(toLowerCase())
}

fun main() {
    val s1: String? = "Howdy!"
    s1?.echo()

    val s2: String? = null
    s2?.echo()

    trace eq """
        HOWDY!
        Howdy!
        howdy!
    """.trimIndent()
}