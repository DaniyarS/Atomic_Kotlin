package extensionsfunctions

import atomictest.eq

fun String.strangeQuote() =
    this.singleQuote().singleQuote()

fun String.toManyQuotes() =
    this.doubleQuote().doubleQuote()

fun main() {
    "Hi".strangeQuote() eq  "''Hi''"
    "Hi".toManyQuotes() eq "\"\"Hi\"\""
}