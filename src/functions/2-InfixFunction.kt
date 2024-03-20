package functions

// Code with ♥️
// Created by Oguzhan OZGOKCE 


fun main() {

    /**
     * Daha okunakli kodlar yazmak için kullanılır
     * .(nokta) kullanımını kaldırır.
     * 1. infix keywordu ile başlar
     * 2. fonksiyon bir uye fonksiyon olmalidir. (Bir class' a ait olmalıdır.)
     * 3. Ya da bir extension fonksiyon olmalıdır.
     * 4. Bir parametre almalıdır.
     * 5. infix method'un parametresi default olmamalıdır.
     *
     * Yapısal olarak;
     * infix fun <parametre> <fonksiyonAdi>(parametre: <tip>) : <dönüşTipi> {
     */

    val isStudent = false
    val isMale = true

    /**
     *  and, or, xor gibi onlarca infix method vardir.
     */

    if(!isStudent and isMale) {
        println("Welcome to the student")
    }

    //infix method kullanımı

    isStudent and isMale
    isStudent.and(isMale)

    val awesomeInstance = AwesomeClass()
    //infix kullanımı
    awesomeInstance download "https://www.google.com"
    awesomeInstance.download("https://www.google.com")

//------------------------------------------------------------------------

    val number = 5
    //if (number + number - 2 * (awesomeInstance specialPlus 4) == 5) {
    //    println("Special Plus")
    //}

}


class AwesomeClass {
    infix fun download(url: String) {
        println("Downloading from $url")
    }
    infix fun specialPlus(number: Int) {
        println("Special Plus $number")
    }

}

