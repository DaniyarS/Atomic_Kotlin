package atomic_kotlin.section_1_2_3.third_chapter.atomic_test

import atomictest.*

fun main() {
    val v1 = 11
    val v2 = "Ontology"

    v1 eq 11
    v2 eq "Ontology"

    v2 neq "Epistimology"
}