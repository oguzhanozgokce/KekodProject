package basics.loop

// Code with ♥️
// Created by Oguzhan OZGOKCE


fun main() {

    /**
     * Bir degiskene null deger atamak icin ? isareti kullanilir.
     * Eger bir degiskene tip verilmez e direkt null deger atanirsa, IDE Type Inference yapar ve degiskenin degerini Nothing? olarak belirler.
     * Cunku hangi tip olacagini bilemez.
     */

    val name: String? = null
    val age:Int ? = null
    val number : Nothing? = null    // Nothing?
    val sum = null     // Nothing?
    val eren : Int = 5;


    //---------------------------------------------------------------------------------------------------------------

    val result : Int? = 0
    result?.plus(5)
    result!!.plus(5)

    /**
     *  result?.plus(5)  - > ?. anlamı: result degeri Null olabilir ama sonradan baska deger atandıysa bu kod calıssın.
     *                          eger result null ise kodu calıstırmaz.
     *  result!!.plus(5) - > anlamı: result degeri null olamayacagını garanti ederiz.  Null olursa exception fırlatır.
     *
     *  Kritik islerde !! kullanmak gerekir.(Banka kredi hesaplaması)
     */
}