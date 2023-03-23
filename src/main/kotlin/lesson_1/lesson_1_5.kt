package lesson_1

fun main() {
    val seconds: Int = 6480
    println(dateFormatter(seconds))
}

fun dateFormatter(seconds: Int): String {
    val minutes: Int = seconds / 60
    val updSeconds: Int = seconds % 60

    return if (updSeconds < 10) "$minutes:0$updSeconds"
    else "$minutes:$updSeconds"
}