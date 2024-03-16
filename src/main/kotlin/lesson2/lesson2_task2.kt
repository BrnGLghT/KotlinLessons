package org.example.lesson2

fun main(){
    val employees = 50
    val emplSalary = 30000
    val interns = 30
    val interSalary = 20000

    val sumEmplPayments = employees * emplSalary
    val sumAllPayments = sumEmplPayments + (interns * interSalary)
    val averageSalary = sumAllPayments / (employees+interns)

    println(sumEmplPayments)
    println(sumAllPayments)
    println(averageSalary)
    //переводил значения в Int чтобы перестраховаться, если входящие значения будут не целыми
}