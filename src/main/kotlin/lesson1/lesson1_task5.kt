package org.example.lesson1

const val SECONDS_IN_HOUR = 3600
const val SECONDS_IN_MINUTE = 60


fun main() {
    val seconds = 6480
    val hours = (seconds / SECONDS_IN_HOUR)
    val hoursRestSecs = (seconds - SECONDS_IN_HOUR)
    val minutes = (hoursRestSecs / SECONDS_IN_MINUTE)
    val minutesRestSecs = (seconds % minutes)

    println(String.format("%02d:%02d:%02d", hours, minutes, minutesRestSecs))
}