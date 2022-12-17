fun main() {
    println(checkPattern("abba", "dog cat cat dog dog cat cat dog dog cat cat dog"))
}
fun checkPattern(pattern: String, input: String): Boolean {
    if(pattern.isBlank()) return false

    val words = input.split(" ")
    val map = HashMap<Char, HashSet<String>>()
    val patternStep = pattern.length
    var cnt = -1

    if (words.size % patternStep != 0) return false

    for(i in words.indices step patternStep) {
        cnt++
        for (k in 0 until patternStep) {
            val list = map.getOrDefault(pattern[k], HashSet())
            list.add(words[k+cnt])
            map[pattern[k]] = list
            println(map)
        }
    }

    println(map)
    return map.all { it.value.size == 1 }
}

