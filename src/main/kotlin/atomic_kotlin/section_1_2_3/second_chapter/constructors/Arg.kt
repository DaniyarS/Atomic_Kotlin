package atomic_kotlin.section_1_2_3.second_chapter.constructors

class Alien(name: String) {
    val greeting = "Poor $name!"
}

fun main() {
    val alien = Alien("Mr. Meeseeks")
    println(alien.greeting)
}