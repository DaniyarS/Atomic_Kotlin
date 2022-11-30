fun main(args: Array<String>) {
    val size = readLine()?.toInt() ?: 0

    val arr = Array(size) { "" }

    for (i in 0 until size) {
        arr[i] = readLine().toString()
    }

    arr.forEachIndexed { idx, word ->
        if (word.length > 10) {
            arr[idx] = "${word[0]}${word.length - 2}${word[word.length - 1]}"
        }
    }

    arr.forEach {
        println(it)
    }
}