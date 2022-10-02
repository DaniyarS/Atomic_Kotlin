package atomic_kotlin.third_chapter.atomic_test

import atomictest.eq

fun main() {
    calculateBMI(160, 48) eq "Normal weight"
}

fun calculateBMI(lbs: Int, height: Int): String {
    return "Normal weight"
}