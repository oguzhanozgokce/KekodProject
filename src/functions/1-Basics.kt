package functions

import java.util.*

// Code with ♥️
// Created by Oguzhan OZGOKCE 


/**
 * fun keyword'ü ile fonksiyon tanımlanır.
 * Fonksiyonun ismi verilir.
 * Parametreler parantez içerisinde tanımlanır.
 * : ile dönüş tipi belirtilir.
 * fonksiyonun body'si süslü parantez içerisinde tanımlanır.
 * Geri donus tipi olmayan fonksiyonlarda dönüş tipi Unit olarak belirtilir.
 *
 */
fun main() : Unit {
    println("Hello World")
    takeSquare(5)
    val result = takeSquare(5)
    println(result)

    // ---------------------------------------------------------------------------------------------------

    // Bir class'ın fonksiyonu çağrılırken nokta operatörü ile çağrılır.

    Math.pow(2.0, 3.0) // 2^3 = 8

    // ---------------------------------------------------------------------------------------------------

    // -----İş Görüşme----- Fonksiyonlarda default argüman Nedir?   ****************************
    // Default argüman : Bir fonksiyonun parametrelerinden birine varsayılan bir değer atanmasıdır.
    // Eğer bir parametrenin varsayılan değeri varsa, fonksiyon çağrılırken bu parametreye değer vermek zorunlu değildir.

    takeSum() // 6 + 6 = 12
    takeSum(5) // 5 + 5 = 10

    //name argüman ismi verilerek fonksiyon çağrılır.
    sum()                           // 6 + 6 = 12
    sum(10,20)     // 10 + 20 = 30
    sum(number2 = 9)                // 6 + 9 = 15

    // ---------------------------------------------------------------------------------------------------

    reformatMessage("Hello", true, 5, "en")
    reformatMessage("Hello", size = 5, lang = "en")
    reformatMessage("Hello", size = 5, lang = "en", isUpperCase = true)
    reformatMessage("hello", size = 8)

    // ---------------------------------------------------------------------------------------------------

    /**
     * ------------İş görüşme : vararg nedir?------------
     *
     * Elimizde birden fazla parametre varsa ve kaç tane parametre olucağını bilemiyorsak bu durumda fonksiyona parametre olarak vararg kullanılır.
     */

    getUserInfo("Mehmet", 12.toString(), "Ankara", "Turkey", key = 5)
    getUserInfo(*arrayOf("Mehmet", 12.toString(), "Ankara", "Turkey"), key = 5)

    getUserInfo2("Mehmet", 12.toString(), "Ankara", "Turkey")
    getUserInfo2(*arrayOf("Mehmet", 12.toString(), "Ankara", "Turkey"))





}

fun takeSquare(i: Int) :Int {
    return i * i
}

fun takeSum(i : Int = 6) : Int {
    return i + i
}

fun sum(number1: Int = 6, number2: Int = 6) : Int {
    return number1 + number2
}


fun reformatMessage(message: String, isUpperCase: Boolean = false, size:Int, lang: String = "tr") {
    val locale = if (lang == "tr") {
        Locale("tr", "TR")
    }else{
        Locale("en", "US")
    }

    val formattedMessage = if (isUpperCase) {
        message.uppercase(locale)
    }else{
        message.lowercase(locale)
    }


}

//---------------------------------------------------------------------------------------------------
/**
 * vararg : Cok uzun paremetrelerin fonksiyona gonderilmesi durumunda kullanılır.
 * Bu sayede fonksiyon tek bir parametre alır ve bu parametre bir diziye dönüşür.
 * [index] ya da .get(index) ile dizi elemanlarına erişilebilir.
 *
 */

fun getUserInfo(vararg  userInfo : String, key:Int){
    userInfo[3]
    userInfo.get(3)
}

fun getUserInfo2(vararg  userInfo: String) {
    userInfo[3]
    userInfo.get(3)
}
