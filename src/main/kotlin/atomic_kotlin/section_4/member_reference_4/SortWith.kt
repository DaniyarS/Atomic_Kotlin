package atomic_kotlin.section_4.member_reference_4

import atomictest.eq

fun main() {
    val messages = listOf(
        Message("Kitty", "Hey!", true),
        Message("Kitty", "Where are you?", false),
        Message("Boss", "Meeting today", false)
    )

    messages.sortedWith(compareBy(
        Message::isRead, Message::sender
    )) eq listOf(
        Message("Boss", "Meeting today", false),
        Message("Kitty", "Where are you?", false),
        Message("Kitty", "Hey!", true)
    )
}