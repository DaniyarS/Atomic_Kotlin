package atomic_kotlin.section_1_2_3.fifth_chapter

import atomictest.eq

fun evaluate(vararg ints: Int) =
    "Size: ${ints.size}\n" +
            "Sum: ${ints.sum()}\n" +
            "Average: ${ints.average()}"

fun main() {
    evaluate(10, -3, 1, 8, 9) eq """
        Size: 5
        Sum: 25
        Average: 5.0
    """
}