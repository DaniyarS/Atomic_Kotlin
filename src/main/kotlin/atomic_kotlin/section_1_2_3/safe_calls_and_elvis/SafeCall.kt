package atomic_kotlin.section_1_2_3.safe_calls_and_elvis

import atomictest.eq

fun checkLength(s: String?, expected: Int?) {
    val length1 = if (s != null) s.length else null
    val length2 = s?.length

    length1 eq expected
    length2 eq expected
}

fun main() {
    checkLength("abc", 3)
    checkLength(null, null)
}
