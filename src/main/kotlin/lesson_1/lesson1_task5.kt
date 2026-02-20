package org.example.lesson_1
const val secondPerMinute:Int = 60

fun main(){
    val seconds = 6481

    val hours = seconds / (secondPerMinute*secondPerMinute)
    var remSeconds = seconds - hours * secondPerMinute*secondPerMinute
    val minutes = remSeconds / secondPerMinute
    remSeconds = seconds - hours * secondPerMinute*secondPerMinute- minutes * secondPerMinute

    println("%02d:%02d:%02d".format(hours, minutes,remSeconds))
}