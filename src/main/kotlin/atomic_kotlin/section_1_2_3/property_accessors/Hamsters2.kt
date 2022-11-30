package atomic_kotlin.section_1_2_3.property_accessors

class Cage2(private val maxCapacity: Int) {
    private val hamsters = mutableListOf<Hamster>()
    fun capacity(): Int = maxCapacity - hamsters.size
    fun isFull(): Boolean = hamsters.size == maxCapacity
}