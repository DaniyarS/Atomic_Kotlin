import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val count = sc.nextLine().toInt()

    val lines = mutableListOf<String>()
    repeat(count) { lines.add(sc.nextLine()) }

    val rootView = parseViewHierarchy(lines)

    val point = sc.nextLine().split(" ")
    val x = point[0].toInt()
    val y = point[1].toInt()
    val hitView = hitTest(rootView, x, y)

    println(hitView?.name ?: "null")
}

fun parseViewHierarchy(lines: List<String>): ViewGroup {
    val rootLine = lines[0].split(" ")
    val root = ViewGroup(
        rootLine[0], rootLine[1].toInt(),
        rootLine[2].toInt(), rootLine[3].toInt(), rootLine[4].toInt()
    )

    if (lines.size > 1) {
        // Добавляем view из середины иерархии
        for (i in 1 until lines.size) {
            root.addView(
                ViewGroup(
                    rootLine[0], rootLine[1].toInt(),
                    rootLine[2].toInt(), rootLine[3].toInt(), rootLine[4].toInt()
                )
            )
        }
    }

    return root
}

fun hitTest(root: View, x: Int, y: Int): View? {
    if (((root.right - root.left) < x) || ((root.bottom - root.top) < y))
        return null

    if ((root as ViewGroup).getChildCount() > 1) {
        var counter = root.getChildCount() - 1

        while (counter >= 0) {
            val child = root.getChildAt(counter)
            if ((child.right > x && child.left < x ) && (child.bottom > y && child.top < y)) return child
            counter--
        }
    } else {
        if ((root.right - root.left > x) || (root.bottom - root.top > y)) return root
    }

    return null
}

open class View(val name: String, val left: Int, val top: Int, val right: Int, val bottom: Int)

class ViewGroup(
    name: String, left: Int, top: Int, right: Int, bottom: Int,
) : View(name, left, top, right, bottom) {

    private val children = mutableListOf<View>()

    fun getChildCount() = children.size
    fun getChildAt(index: Int) = children[index]
    fun addView(child: View) = children.add(child)
}