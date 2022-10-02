package atomic_kotlin.third_chapter.atomic_test

import atomictest.eq

fun main() {
    //Test fail
    calculateBMI2(160, 68) eq "Normal weight"
    calculateBMI2(100, 68) eq "Underweight"
    calculateBMI2(200, 68) eq "Overweight"

}

fun calculateBMI2(lbs: Int, height: Int): String {
    val bmi = lbs / (height * height) * 703.07

    return if (bmi < 18.5) "Underweight"
    else if(bmi < 25) "Normal weight"
    else "Overweight"
}