package org.example.lesson2

fun main (){
    val crystalOre = 7
    val ironOre = 11
    val divider = 100
    val buffPercent = 20

    println("Дополнительно добытая кристаллическая руда = ${(crystalOre * buffPercent) / divider}")
    println("Дополнительно добытая металлическая руда = ${(ironOre * buffPercent) / divider}")
}