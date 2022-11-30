package exceptions

fun erroneousCode() {
    val i = "1$".toInt()
}

fun main() {
    erroneousCode()
}