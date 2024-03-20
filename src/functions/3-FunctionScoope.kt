package functions

// Code with ♥️
// Created by Oguzhan OZGOKCE 


/**
 * Bir fonksiyon bir sinifin içerisinde değil de bir dosyasının içersinde boşlukta tanımlanırsa bu fonksiyonun scope'u global olur.
 *
 * Bir fonksiyon oluşturulurken top level tanimlama yapiliyorsa, sadece bir sinifa ait fonksiyonlar yazılabiliyorsa bunlara fonksiyon değil method denir.
 * Bir fonksiyona fonksiyon diyebilmeniz için bir sinifa ait olması gerekir.(Top level tanimlama yapilmamalidir.)
 *
 */

fun main() {
    calculateAtomPhisics()
}

//---------------------------------------------------------------------------------

/**
 * Fonksiyon içerisinde fonksiyon tanımı kotlin'de yapılabilir. Bu fonksiyonlara Local Function denir.
 * Sebebi ise, yazdığniz fonsiyonun kendi sinifinizdan dahi cağrılmasını istemiyorsanız bu fonksiyonu local olarak tanımlayabilirsiniz.
 */

fun calculateAtomPhisics() {
    println("Atom Fizigi Hesaplandi.")
}

//---------------------------------------------------------------------------------

/**
 * Bir class'ın içindeki fonsiyonlara, uye fonskiyonlar denir.
 */

class Car {
    fun setColor() {
        println("Renk belirlendi.")
    }
}

//---------------------------------------------------------------------------------

/**
 * Bir fonsksiyonu generic tip aliyorsa, generic function olarak adlandirilir.
 *
 */

fun <T> setColor(colorCodeId: T) {
    println("Renk belirlendi.")
}