package atomic_kotlin.section_1_2_3.second_chapter.constructors

class MutableNameAlien(var name: String)

class FixedNameAlien(val name: String)

fun main() {
    val alien1 = MutableNameAlien("Reverse Giraffe")
    val alien2 = FixedNameAlien("Krombopolis Michael")

    alien1.name = "Parasite"
    
}