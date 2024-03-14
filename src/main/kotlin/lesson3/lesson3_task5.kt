package org.example.lesson3

fun main() {
    val playerMove = "D2-D4;0"

    val movesList = playerMove.split(";")
    val move = movesList[0].split("-")
    val start = move[0]
    val finish = move[1]
    val moveNum = movesList[1]

    println("Откуда: $start")
    println("Куда: $finish")
    println("Номер хода: $moveNum")
}