package org.example.lesson4

const val ALL_TABLES = 13

fun main() {
    val todayReserv = 13
    val tomorrowReserv = 9

    println("Доступность столиков на сегодня: ${todayReserv != ALL_TABLES}\nДоступность столиков на завтра: ${tomorrowReserv != ALL_TABLES}")
}