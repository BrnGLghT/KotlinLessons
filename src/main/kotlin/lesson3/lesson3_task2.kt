package org.example.lesson3

fun main() {
    val firstName = "Татьяна"
    var secondName = "Андреева"
    val thirdName = "Сергеевна"
    var age = 20
    println("$secondName $firstName $thirdName, $age")
    age = 22
    secondName = "Сидорова"
    println("$secondName $firstName $thirdName, $age")
}