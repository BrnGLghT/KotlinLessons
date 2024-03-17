package org.example.lesson4

const val MIN_WEIGHT_AVERAGE = 35
const val MAX_WEIGHT_AVERAGE = 100
const val MAX_VOLUME_AVERAGE = 100

fun main() {
    //Average масса больше 35 и меньше 100, общем меньше 100
    val firstPackWeight = 20
    val firstPackVolume = 80

    val secondPackWeight = 50
    val secondPackVolume = 100

    println(
        "Груз весом $firstPackWeight кг и объемом $firstPackVolume соотвествует категории" +
                " 'Average':${(firstPackWeight <= MAX_WEIGHT_AVERAGE) && (firstPackWeight >= MIN_WEIGHT_AVERAGE) && (firstPackVolume <= MAX_VOLUME_AVERAGE)}\n" +
                "Груз весом $secondPackWeight кг и объемом $secondPackVolume соотвествует категории" +
                " 'Average':${(secondPackWeight <= MAX_WEIGHT_AVERAGE) && (secondPackWeight >= MIN_WEIGHT_AVERAGE) && (secondPackVolume <= MAX_VOLUME_AVERAGE)}"
    )
}