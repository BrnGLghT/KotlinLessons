package org.example.lesson2

fun main(){
    val avgGrade: Double = (3.0 +4.0 +3.0+5.0) / 4.0
    val formatAvgGrade = String.format("%.2f", avgGrade)
    println(formatAvgGrade)
}