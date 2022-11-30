package atomic_kotlin.section_1_2_3.data_classes

import atomictest.eq

data class DetailedContact(
    val name: String,
    val surname: String,
    val number: String,
    val address: String
)

fun main() {
    val contact = DetailedContact(
        "Miffy",
        "Miller",
        "1-234-567890",
        "1600 Amphitheatre Parkway"
    )

    val newContact = contact.copy(
        number = "098-765-4321",
        address = "Brandschenkestrasse 110"
    )

    newContact eq DetailedContact(
        "Miffy",
        "Miller",
        number = "098-765-4321",
        address = "Brandschenkestrasse 110"
    )
}