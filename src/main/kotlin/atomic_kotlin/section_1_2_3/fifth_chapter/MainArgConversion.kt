package atomic_kotlin.section_1_2_3.fifth_chapter

fun main(args: Array<String>) {
    if (args.size < 3) return
    val first = args[0]
    val second = args[1].toInt()
    val third = args[2].toFloat()

    println("$first $second $third")
}