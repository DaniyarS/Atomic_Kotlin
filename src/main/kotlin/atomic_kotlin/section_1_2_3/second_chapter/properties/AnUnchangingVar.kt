package atomic_kotlin.section_1_2_3.second_chapter.properties

class Sofa {
    val cover: String = "Loveseat cover"
}

fun main() {
    var sofa = Sofa()
    sofa = Sofa()
}