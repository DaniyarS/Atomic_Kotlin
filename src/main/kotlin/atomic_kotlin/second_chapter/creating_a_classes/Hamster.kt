package atomic_kotlin.second_chapter.creating_a_classes

class Hamster {

    fun speak() = "Squeak! "
    fun exercise() = speak() +
            speak() +
            "Running on wheel"

}

fun main() {
    val hamster = Hamster()
    println(hamster.exercise())
}