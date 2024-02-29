package basics.controlflow

import java.util.Locale.getDefault

// Code with ♥️
// Created by Oguzhan OZGOKCE 


fun main() {
    /**
     * when : switch-case'in gelişmiş hali olarak düşünülebilir.
     * when if-else ifadelerinin yerine kullanılabilir.
     * when(karsilastirilacakDeger) {
     *     value1 -> { }
     *     value2 -> { }
     *     else -> { }
     */

    val countryCode = readLine()!!
    when(countryCode.lowercase(getDefault())) {
        "tr" ,"az" -> println("Türkiye")
        "us" -> println("Amerika")
        "de" -> println("Almanya")
        "fr" -> println("Fransa")
        else -> println("Bilinmeyen ülke")
    }
    when(countryCode.toInt()){
        3 or 5 -> println("Tc ve Azerbaycan")
        7.and(1) -> println("Rusya")
    }

    //--------------------------------------------------------------------------------

    /**
     * range kullanımı
     */
    val number = 10
    when(number) {
        in 1..10 -> println("1-10 arasında")
        in 11..20 -> println("11-20 arasında")
        in 21..30 -> println("21-30 arasında")
        else -> println("Bilinmeyen")
    }
}