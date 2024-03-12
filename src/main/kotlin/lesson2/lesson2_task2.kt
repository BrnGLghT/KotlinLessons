package org.example.lesson2

fun main(){
    val employees = 50
    val emplSalary = 30000
    val interns = 30
    val interSalary = 20000

    val sumEmplPayments = 50 * 30000
    val sumAllPayments = sumEmplPayments + (30 * 20000)
    val averageSalary = sumAllPayments / (50+30)

    println(sumEmplPayments.toInt())
    println(sumAllPayments.toInt())
    println(averageSalary.toInt())
}