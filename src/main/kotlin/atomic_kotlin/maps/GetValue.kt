package atomic_kotlin.maps

import atomictest.capture
import atomictest.eq

fun main() {
    val map = mapOf('a' to "attempt")
    map['b'] eq null
    capture {
        map.getValue('b')
    }
}