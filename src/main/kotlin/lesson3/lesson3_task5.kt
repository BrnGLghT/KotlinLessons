package org.example.lesson3

fun main() {
    val playerMove = "D2-D4;0"

    val splitPlayerMoveString = playerMove.split("-", ";")
    val start = splitPlayerMoveString[0]
    val finish = splitPlayerMoveString[1]
    val moveNum = splitPlayerMoveString[2]

    println("Откуда: $start")
    println("Куда: $finish")
    println("Номер хода: $moveNum")
}