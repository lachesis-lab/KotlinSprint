package org.example.lesson_1

fun main(){
    val seconds: Int = 6480
    var hours: Int
    var minutes: Int
    var remMinutes: Int
    var remSeconds: Int

    hours = seconds / 3600
    remSeconds = seconds - hours * 3600
    minutes = remSeconds / 60
    remSeconds = seconds - hours * 3600- minutes * 60

    println("%02d:%02d:%02d".format(hours, minutes,remSeconds))
}