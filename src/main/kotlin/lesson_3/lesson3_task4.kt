package org.example.lesson_3

fun main() {
    var fieldFrom = "E2"
    var fieldTo = "E4"
    var number = 1
    var serverString = "[$fieldFrom-$fieldTo;$number]"
    println(serverString)
    number = 3
    fieldFrom = "D2"
    fieldTo = "${fieldFrom[0]}${fieldFrom.substring(1).toInt()+1}"
    serverString = "[$fieldFrom-$fieldTo;${number}]"
    println(serverString)
}