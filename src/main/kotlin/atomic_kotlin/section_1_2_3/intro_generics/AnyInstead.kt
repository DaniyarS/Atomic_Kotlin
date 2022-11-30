package atomic_kotlin.section_1_2_3.intro_generics

import atomictest.eq

class AnyHolder(private val value: Any) {
    fun getValue(): Any = value
}

class Dog {
    fun bark() = "Ruff!"
}

fun main() {
    val holder = AnyHolder(Dog())
    val any = holder.getValue()

    val genericHolder = GenericHolder(Dog())
    val dog = genericHolder.getValue()
    dog.bark() eq "Ruff!"
}
