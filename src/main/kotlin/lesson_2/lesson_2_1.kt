package lesson_2

import java.text.DecimalFormat

fun main() {
    val array = arrayOf(3, 4, 3, 5)
    val df = DecimalFormat("#.##")
    val average = df.format(array.sum() / array.size.toFloat())
    println(average)
}