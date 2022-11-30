package properexception

import atomictest.capture
import atomictest.eq

fun averageIncome(income: Int, months: Int) =
    if (months == 0)
        throw IllegalStateException(
            "Months can't be zero"
        )
    else
        income / months

fun main() {
    averageIncome(3300, 3) eq 1100
    capture {
        averageIncome(5000, 0)
    } eq "IllegalStateException: " + "Months can't be zero"
}