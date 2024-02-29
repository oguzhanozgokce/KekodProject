package basics

// Code with ♥️
// Created by Oguzhan OZGOKC


fun main() {

    /**
     * Tek tırnaklar arasında, harf, sayı, escapehar ya da unicode yazarak kullanılabilir.
     * Çift tırnaklar arasında ise string ifadeler kullanılır.
     */

    val firstCharOfName: Char = 'O'
    val firstCharOfSurname: Char = 'Ö'
    val charNumber: Char = '5'
    val escapeChar: Char = '\n'
    val unicodeChar: Char = '\u0041'
    val nullableChar: Char? = null

    //---------------------------------------------------------------------------------------------------------------

    /**
     * Number degeri alan Char degisken Int' e cevrilirken, gercek sayısal degerini almaz.
     * ASCII tablosundaki karsılıgı olan sayısal degeri alır.
     */

    val contertedCharNumber2 = charNumber.code

    /**
     * deprecarated olan toInt() fonksiyonu kullaılmalıdır.
     */

    val contertedCharNumber: Int = firstCharOfName.toInt()

    //---------------------------------------------------------------------------------------------------------------

    /**
     * Kacis(Escape) karakterleri
     */

    val exampleString =
        "Kotlin de escape karakterleri örnekleri: \n" +
                "\\n -> yeni satır \n" +
                "\\t -> tab karakteri \t" +
                "\\b -> backspace karakteri \b" +
                "\\r -> carriage return karakteri \r" +
                "\\$ -> dolar işareti \$" +
                "\\\" -> çift tırnak işareti \"" +
                "\\' -> tek tırnak işareti \'"

    println(exampleString)

    //---------------------------------------------------------------------------------------------------------------

    /**
     * Unicode karakterleri
     */

    val unicodeChar1 = '\u0041'  // A
    println(unicodeChar)

    val blackHeart = '\u2665' // ♥
    println(blackHeart)

    //---------------------------------------------------------------------------------------------------------------


}
