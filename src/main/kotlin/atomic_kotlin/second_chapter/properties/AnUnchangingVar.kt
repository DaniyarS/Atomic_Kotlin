package atomic_kotlin.second_chapter.properties

class Sofa {
    val cover: String = "Loveseat cover"
}

fun main() {
    var sofa = Sofa()
    sofa = Sofa()
}