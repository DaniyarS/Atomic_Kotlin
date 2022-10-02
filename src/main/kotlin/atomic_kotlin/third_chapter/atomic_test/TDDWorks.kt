package atomic_kotlin.third_chapter.atomic_test

import atomictest.eq

fun main() {
    //Test fail
    calculateBMI3(160.0, 68.0) eq "Normal weight"
    calculateBMI3(100.0, 68.0) eq "Underweight"
    calculateBMI3(200.0, 68.0) eq "Overweight"
}

fun calculateBMI3(lbs: Double, height: Double): String {
    val bmi = lbs / (height * height) * 703.07

    return if (bmi < 18.5) "Underweight"
    else if(bmi < 25) "Normal weight"
    else "Overweight"
}