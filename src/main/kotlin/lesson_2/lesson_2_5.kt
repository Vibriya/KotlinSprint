package lesson_2

import java.text.DecimalFormat
import kotlin.math.pow

fun main() {
    val contribution = 70_000
    val interestRate = 16.7
    val duration = 20

    val df = DecimalFormat(".000")
    val amountOfSaving = df.format(
        (1 + interestRate / 100).pow(duration) * contribution
    )

    println(amountOfSaving)
}