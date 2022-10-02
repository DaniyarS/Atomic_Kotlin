fun main() {
    val s = "bbbaaaba"
    val t = "aaabbbba"
    val sMap = HashMap<Char, Int>()
    val tMap = HashMap<Char, Int>()
    val mappingMap = HashMap<Char, HashSet<Char>>()

    s.forEachIndexed { idx, ch ->
        sMap[ch] = sMap.getOrDefault(ch, 0) + 1
    }

    t.forEach {
        tMap[it] = tMap.getOrDefault(it, 0) + 1
        mappingMap[it] = HashSet()
    }

    if (sMap.size != tMap.size) println("false 1")

    t.forEachIndexed { idx, ch ->
        if (mappingMap[ch]?.isEmpty() == true) mappingMap[ch]?.add(s[idx])
        if (mappingMap[ch]?.contains(s[idx]) == false) println("false 2")
    }

    println("true")
}