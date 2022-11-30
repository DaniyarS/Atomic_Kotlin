package section_three.ExtensionFunctions

import atomictest.eq

class Book(val title: String)

fun Book.categorize(category: String) =
    """title: "$title", category: $category"""

fun main() {
    Book("Darcula").categorize("Vampire") eq
            """title: "Darcula", category: Vampire"""
}