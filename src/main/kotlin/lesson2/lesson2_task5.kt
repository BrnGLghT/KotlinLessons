package org.example.lesson2

import kotlin.math.pow

fun main (){
    val depositSum: Double = 70_000.0
    val depositTimeYears: Double = 20.0
    val depositPercentage: Double = 16.7

    val finalSum: Double = depositSum * (1 + (depositPercentage / 100)).pow(depositTimeYears)
    println(String.format("%.3f", finalSum))
}