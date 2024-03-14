package org.example.lesson4

fun main() {

    val isSunny = true
    val isRoofOpen = true
    val airHumidity = 20
    val season = "Зима"

    println("Благоприятные сейчас условия для бобовых? ${isSunny && isRoofOpen && airHumidity == 20 && season != "Зима"}")
}