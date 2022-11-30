package atomic_kotlin.section_1_2_3.enumurations
import atomictest.trace
import enumurations.Level
import enumurations.Level.*

fun checkLevel(level: Level) {
    when(level) {
        Overflow -> trace(">>> Overflow!")
        Empty -> trace("Alert: Empty")
        else -> trace("Level $level OK")
    }
}

fun main() {
    checkLevel(Empty)
    checkLevel(Low)
    checkLevel(Overflow)

    trace eq """
        Alert: Empty
        Level Low OK
        >>> Overflow!
        """
}