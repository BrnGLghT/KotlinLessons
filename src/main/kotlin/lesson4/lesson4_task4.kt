package org.example.lesson4

fun main() {
    val day = 5
    val exercisesForArmsAndAbs = day % 2 == 0
    val exercisesForLegsAndBack = day % 2 != 0

    println("""
        Упражнения для рук:       $exercisesForArmsAndAbs
        Упражнения для ног:        $exercisesForLegsAndBack
        Упражнения для спины:      $exercisesForLegsAndBack
        Упражнения для пресса:    $exercisesForArmsAndAbs
    """.trimIndent())
}