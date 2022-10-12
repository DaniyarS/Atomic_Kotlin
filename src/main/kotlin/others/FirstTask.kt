fun main() {
    val answer = Array(3) { IntArray(3)  }

    println(answer.map { it.map { it } })
}