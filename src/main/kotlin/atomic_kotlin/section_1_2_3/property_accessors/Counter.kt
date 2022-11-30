package atomic_kotlin.section_1_2_3.property_accessors

import atomictest.eq

class Counter {
    var value: Int = 0
        private set

    fun inc() = value++
}

fun main() {
    val counter = Counter()
    repeat(10) {
        counter.inc()
    }

    counter.value eq 10
}