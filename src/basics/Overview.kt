package basics

// Code with ♥️
// Created by Oguzhan OZGOKCE

class Overview {

    val name: String = "Oguzhan"
    val age: Int = 25
    val isMale: Boolean = true
    val firstLetterOfName: Char = 'O'

    var width = 100
    var height = 200
    var length = 300
    var usedSpace = 0

    val availableSpace : Int
        get() {
            return  (width * height * length) - usedSpace
        }
}

/**
 * Kotlin de iki tür değişken vardır:
 * primitive tipli değişkenler ve referans tipli değişkenler
 * primitive tipler: Int, Long, Short, Byte, Double, Float, Char, Boolean
 * referans tipler: String, Array, Class
 */

// Kotlin de her şey bir class' sa biz primitive tiplere sahip degilmiyiz?
/**
 * Class gibi gözüken primitive tiplerde özel optimazyonla byte code cevriliyor.
 * val age: Int = 25  arka planda java da int e cevriliyor.
 * Not: Bu tip dönüsümü degildir.
 */

/**
 * val için genelde inMutable degisken denir. Yani degeri degistirilemez. Fakat bu yanlis bir tanimdir.
 * Dogrusu read-only degiskenlerdir. Yani ilk deger atamasından sonra tekrar deger atanamaz.
 * val availableSpace : Int
 *         get() {
 *             return  (width * height * length) - usedSpace
 *         }
 * burada availableSpace degiskeni degistirilemez degildir. Return degerine göre degeri degisebilir.
 */

