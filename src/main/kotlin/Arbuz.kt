fun main(vararg args: String) {

    val s = "coaching"
    val t = "coding"

    var count = t.length
    var cnt = 0
    val tLen = count

    for(i in s.indices) {
        if(t.substring(cnt, tLen).indexOf(s[i]) != -1) {
            count--
            cnt++
        } else {
            break
        }
    }

    println(count)
}

