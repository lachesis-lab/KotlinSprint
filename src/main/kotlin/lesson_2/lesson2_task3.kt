package org.example.lesson_2

const val MINUTES_PER_HOUR = 60

fun main() {
    val departureHour = 9
    val departureMinute = 39
    val transitTime = 457

    val departureTime: Int = departureHour * MINUTES_PER_HOUR + departureMinute
    val arrivalTime: Int = departureTime + transitTime
    val arrivalHour: Int = arrivalTime / MINUTES_PER_HOUR
    val arrivalMinute = arrivalTime - arrivalHour * MINUTES_PER_HOUR

    println("%02d:%02d".format(arrivalHour, arrivalMinute))
}