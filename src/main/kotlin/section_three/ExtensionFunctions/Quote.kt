package other

import atomictest.eq
import extensionsfunctions.doubleQuote
import extensionsfunctions.singleQuote

fun main() {
    "Single".singleQuote() eq "'Single'"
    "Double".doubleQuote() eq "\"Double\""
}