package atomic_kotlin.section_1_2_3.break_and_continue_12

import atomictest.eq

fun main() {
    val nums = mutableListOf(0)

    var i = 0

    while (i < 100) {
        i += 4
        if (i == 8) continue
        if (i == 40) break
        nums.add(i)
    }

    nums eq "[0, 4, 12, 16, 20, 24, 28, 32, 36]"
}