package org.example.lesson4

fun main() {
    //Average масса больше 35 и меньше 100, общем меньше 100
    val firstPackWeight = 20
    val firstPackVolume = 80

    val secondPackWeight = 50
    val secondPackVolume = 100

    println("Груз весом $firstPackWeight кг и объемом $firstPackVolume соотвествует категории 'Average':${firstPackWeight <= 100 && firstPackWeight >= 35 && firstPackVolume <=100}\n" +
            "руз весом $secondPackWeight кг и объемом $secondPackVolume соотвествует категории 'Average':${secondPackWeight <= 100 && secondPackWeight >= 35 && secondPackVolume <=100}")
}