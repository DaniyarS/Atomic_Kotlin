package atomic_kotlin.second_chapter.constructors

class Alien(name: String) {
    val greeting = "Poor $name!"
}

fun main() {
    val alien = Alien("Mr. Meeseeks")
    println(alien.greeting)
}