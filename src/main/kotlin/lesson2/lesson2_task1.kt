package org.example.lesson2

fun main(){
    val avgGrade = ((3 + 4 + 3 + 5).toFloat() / 4)
    val formatAvgGrade = String.format("%.2f", avgGrade)
    println(formatAvgGrade)
}