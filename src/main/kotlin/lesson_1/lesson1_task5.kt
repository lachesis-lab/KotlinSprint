package org.example.lesson_1

const val SECONDS_PER_MINUTE:Int = 60

fun main() {
    val seconds = 6480
    val hours = seconds / (SECONDS_PER_MINUTE * SECONDS_PER_MINUTE)
    var remSeconds = seconds - hours * SECONDS_PER_MINUTE * SECONDS_PER_MINUTE
    val minutes = remSeconds / SECONDS_PER_MINUTE
    remSeconds = seconds - hours * SECONDS_PER_MINUTE * SECONDS_PER_MINUTE - minutes * SECONDS_PER_MINUTE

    println("%02d:%02d:%02d".format(hours, minutes, remSeconds))
}