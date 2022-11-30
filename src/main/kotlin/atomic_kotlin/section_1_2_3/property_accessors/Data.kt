package atomic_kotlin.section_1_2_3.property_accessors

import atomictest.eq

class Data(var i: Int)

fun main() {
    val data = Data(10)
    data.i eq 10
    data.i = 20
}