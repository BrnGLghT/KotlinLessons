package org.example.lesson2

const val MINS_IN_HOUR = 60

fun main (){
    val startHours = 9
    val startMinsOfHour = 39
    val roadTimeMins = 457

    val startMinutes = startHours * MINS_IN_HOUR + startMinsOfHour
    val finishTimeInMins = startMinutes + roadTimeMins
    val finishTimeHours: Int = finishTimeInMins / MINS_IN_HOUR
    val finishTimeMinsOfHour: Int = finishTimeInMins % MINS_IN_HOUR

    println(String.format("%02d:%02d", finishTimeHours, finishTimeMinsOfHour))
}