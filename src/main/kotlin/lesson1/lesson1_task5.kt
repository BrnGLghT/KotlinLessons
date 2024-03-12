package org.example.lesson1
const val secondsInHour = 3600
const val secondsInMinute = 60
fun main(){
    val seconds = 6480
    val hours = (seconds / secondsInHour)
    val hoursRestSecs = (seconds - secondsInHour)
    val minutes = (hoursRestSecs / secondsInMinute)
    val minutesRestSecs = (seconds % minutes)

    println(String.format("%02d:%02d:%02d", hours, minutes, minutesRestSecs))
}