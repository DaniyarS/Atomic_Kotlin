package atomic_kotlin.section_1_2_3.second_chapter.visibility

class Cookie(
    private var isReady: Boolean
){
    private fun crumble() = println("crumble")

    public fun bite() = println("bite")

    fun eat() {
        isReady = true
        crumble()
        bite()
    }
}

fun main() {
    val x = Cookie(false)
    x.bite()
    x.eat()
}

