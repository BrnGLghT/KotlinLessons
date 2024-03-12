package org.example.lesson2

fun main (){
    val startHours = 9
    val startMinsOfHour = 39
    val roadTimeMins = 457

    val startMinutes = startHours * 60 + startMinsOfHour
    val finishTimeInMins = startMinutes + roadTimeMins
    val finishTimeHours: Int = finishTimeInMins / 60
    val finishTimeMinsOfHour: Int = finishTimeInMins % 60

    println(String.format("%02d:%02d", finishTimeHours, finishTimeMinsOfHour))
}