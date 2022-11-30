package nameanddefault

class DefaultArg

fun h(d: DefaultArg = DefaultArg()) =
    println(d)

fun main() {
    h()
    h()
}