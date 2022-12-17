package atomic_kotlin.section_4.high_order_functions_5

import atomictest.eq

fun main() {
    val returnTypeNullable: (String) -> Int? = { null }
    val mightBeNull: ((String) -> Int)? = null

    returnTypeNullable("abc") eq null

    if (mightBeNull != null) {
        mightBeNull("abc")
    }
}