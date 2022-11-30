package atomic_kotlin.section_4.operations_on_collections_3

import atomictest.eq

data class Product(
    val description: String,
    val price: Double
)

fun main() {
    val products = listOf(
        Product("bread", 2.0),
        Product("wine", 5.0)
    )

    products.sumByDouble { it.price } eq 7.0

    products.sortedByDescending { it.price } eq listOf(Product("wine", 5.0),  Product("bread", 2.0))

    products.minByOrNull { it.price } eq Product("bread", 2.0)
}
