fun main() {
    val (s1, s2) = readLine().toString().split(' ')

    val builder1 = StringBuilder()
    val builder2 = StringBuilder()

    s1.forEach {
        when {
            it == '.' && builder1.isNotBlank() -> builder1.deleteCharAt(builder1.lastIndex)
            it != '.' -> builder1.append(it)
        }
    }

    s2.forEach {
        when {
            it == '.' && builder2.isNotBlank() -> builder2.deleteCharAt(builder2.lastIndex)
            it != '.' -> builder2.append(it)
        }
    }

    println(builder1)
    println(builder2)

    if(builder1.toString() == builder2.toString()) println("true")
    else println("false")
}