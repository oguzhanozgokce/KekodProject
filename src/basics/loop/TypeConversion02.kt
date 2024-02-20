package basics.loop

// Code with ♥️
// Created by Oguzhan OZGOKCE |

fun main(){

    /**
     *        Implicit Type Conversion   : Belirgin olmayan tip donusumu
     *        Explicit Type Conversion   : Acık - Belirgin olan tip donusumu
     *
     *        KOTLİNDE Implicit Type Conversion YOKTUR.
     */

    /**
     * Tip donusumu icin kullanilan fonksiyonlar:
     * toByte(), toShort(), toInt(), toLong(), toFloat(), toDouble(), toChar()
     *
     * Değer aralığı küçük olan tipler büyük olan tiplere sorunsuz bir şekilde değiştirilebilir.
     */


    val phoneNumber = 126.toByte()


    //---------------------------------------------------------------------------------------------------------------

    /**
     * İki number arasında matematiksel işlem yapılırsa, sonuç değeri büyük değerin tipinde olacaktır.
     */

    val longValue = 400000L
    val intValue = 34
    val totalValue = longValue + intValue // Long > Int  -> Long

    //---------------------------------------------------------------------------------------------------------------

    /**
     * İki tane Int tipinde max değerli sayıyı çarptığımızda sonuç Int tipinde olacaktır.
     */
    val Number1 = 2_100_000_000
    val Number2 = 2_100_000_000
    val result = Number1 * Number2 // Int * Int = Int result: -2147483648

}