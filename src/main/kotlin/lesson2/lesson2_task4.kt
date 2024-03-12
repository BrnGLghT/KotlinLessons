package org.example.lesson2

const val BUFF_PERCENT = 20

fun main (){
    val crystalOre = 7
    val ironOre = 11

    println("Дополнительно добытая кристаллическая руда = ${(crystalOre * BUFF_PERCENT) / 100}")
    println("Дополнительно добытая металлическая руда = ${(ironOre * BUFF_PERCENT) / 100}")
}