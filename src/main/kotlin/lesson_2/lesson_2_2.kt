package lesson_2

fun main() {
    val departureHour = 9
    val departureMinute = 39
    val travelTime = 457

    val allMinutes = departureMinute + travelTime
    val arrivalHour = departureHour + allMinutes / 60
    val arrivalMinute = allMinutes % 60

    println("$arrivalHour:$arrivalMinute")
}