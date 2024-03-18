package org.example.lesson4

const val WEATHER_SUNNY = true
const val ROOF_OPENED = true
const val AIR_HUMIDITY_PERFECT = 20
const val SEASON_SPRING = "Весна"
const val SEASON_SUMMER = "Лето"
const val SEASON_FALL = "Осень"


fun main() {

    val isSunnyToday = true
    val isRoofOpenToday = true
    val airHumidityToday = 20
    val seasonToday = "Зима"

    println("Благоприятные сейчас условия для бобовых? ${isSunnyToday == WEATHER_SUNNY && isRoofOpenToday == ROOF_OPENED &&
    airHumidityToday == AIR_HUMIDITY_PERFECT && (seasonToday == SEASON_SPRING || seasonToday == SEASON_SUMMER || seasonToday == SEASON_FALL)}")
}