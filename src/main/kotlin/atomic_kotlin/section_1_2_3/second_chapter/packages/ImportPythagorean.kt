package atomic_kotlin.section_1_2_3.second_chapter.packages

import pythagorean.RightTriangle

fun main() {
    val rt = RightTriangle(3.0, 4.0)
    println(rt.hypotenuse())
    println(rt.area())
}