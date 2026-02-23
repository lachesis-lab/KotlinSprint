package org.example.lesson_3

fun main() {

    val number = 6
    var multiplyString = ""
    for (n in 1..9) {
        multiplyString += "$number X $n = ${number * n} \n"
    }
    println(multiplyString)
}