package atomic_kotlin.second_chapter.properties

class House {
    var sofa: String = ""
}

fun main() {
    val house = House()
    house.sofa = "Simple sleeper sofa: $89.00"
    println(house.sofa)
    house.sofa = "New leather sofa: $3,009.00"
    println(house.sofa)
}