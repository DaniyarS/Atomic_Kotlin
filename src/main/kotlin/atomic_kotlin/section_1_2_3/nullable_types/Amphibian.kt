package atomic_kotlin.section_1_2_3.nullable_types

class Amphibian

enum class Species {
    Frog, Toad, Salamander, Caecilian
}

fun main() {
    val a1: Amphibian = Amphibian()
    val a2: Amphibian? = null
    val at1: Species = Species.Toad
    val at2: Species? = null
}
