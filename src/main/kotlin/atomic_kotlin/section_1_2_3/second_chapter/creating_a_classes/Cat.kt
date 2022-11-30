package atomic_kotlin.section_1_2_3.second_chapter.creating_a_classes

class Cat {
    fun meow() = "mrrrow!"
}

fun main() {
    val cat = Cat()
    val m1 = cat.meow()
    println(m1)
}