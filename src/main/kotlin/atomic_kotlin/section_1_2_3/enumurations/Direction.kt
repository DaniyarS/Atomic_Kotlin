package atomic_kotlin.section_1_2_3.enumurations

import atomictest.eq

enum class Direction(val notation: String) {
    North("N"), South("S"),
    East("E"), West("W");

    val opposite: Direction
        get() = when (this) {
            North -> South
            South -> North
            West -> East
            East -> West
        }
}

fun main() {
    Direction.North.notation eq "N"
    Direction.North.opposite eq Direction.South
    Direction.West.opposite.opposite eq Direction.West
    Direction.North.opposite.notation eq "S"
}