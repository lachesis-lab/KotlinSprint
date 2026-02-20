package org.example.lesson_2

fun main(){
    val arrRating = arrayOf(3,4,3,5)
    val averageRating = arrRating.sum()/arrRating.size
    println("%6.2f".format(averageRating.toDouble()))
}