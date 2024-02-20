@file:Suppress("DEPRECATION")

package basics.loop

import java.util.*

// Code with ♥️
// Created by Oguzhan OZGOKCE 


fun main() {

    /**
     * İş görüşmesi Teknik Show
     * Val ve var farkı ?
     * Var degişebilir degişken val değişemeyen değişken, çok bilinenin aksine val' a immutable derler fakat immutable değildir.
     * val read-only değişkendir.(Degeri okunabilir sadece ama deger atanamaz dolasıyla okunabilen degisken degiştirilebilir ama
     * bir class'ın içindeki bir veriable' a val olsa bile get fonksiyonu üzerinden geri döndürdüğü değeri değiştirebiliriz o yüzden immutable değilidir)
     * Stringler val yada var olmalarına karşılık ikisi için de immutabledır. Value değeri memory'de heap alanında saklanırken üzerine atama yapılmaz. Garbage collector tarafından bir yerden sonra silinir
     * ama yeni olan değer heap alanında ikinci bir value olarak saklanır. Bu yüzden ilk değer değişmediği için bu durumda String değişkenler immutable'dır.
     * Tabiki var olduğu durumda yeni bir değer alabilir. Ama ilk değer hala memory de kaldığı için immutable'dır.
     */

    //---------------------------------------------------------------------------------------------------------------

    /**
     * Yaklasık her karakter basına 2 byte yer kaplar.
     *
     * Cift tirnak icindeki karakterlerler bütünü
     * Bir string ifadeyi tek tek karakterlere ayırıp bir char dizisi oluşturur.
     */

    val name: String = "Oguzhan"
    val nameArray: CharArray = name.toCharArray()
    for (char in nameArray) {
        print("$char ")
    }
    println()
    println("-------------------------------------------------")

    val awesomeKekod = "Kekod is Awesome"
    val fisrtCharOfAwesomeKekod = awesomeKekod[0]
    println(fisrtCharOfAwesomeKekod)
    println("-------------------------------------------------")
    val fisrtCharOfAwesomeKekod2 = awesomeKekod[awesomeKekod.indices.first]
    println(fisrtCharOfAwesomeKekod2)
    println("-------------------------------------------------")
    //son karatkeri almak icin
    val fisrtCharOfAwesomeKekod3 = awesomeKekod[awesomeKekod.length-1]
    println(fisrtCharOfAwesomeKekod3)
    println("-------------------------------------------------")

    //---------------------------------------------------------------------------------------------------------------

    /**
     * Stringler immutable oldugu için. Bir string ilk deger atandıktan sonra degistirilemez. ya da yeni bir deger set edilemez.
     * String üzerinde yapılan her islemler bize yeni bir String object'i döner.
     * String'in ilk hali degismeyecektir. Arka planda degisen String'i işaret eder.
     */

    var surname = "OZGOKCE"
    surname = "DEMIR"

    val surName2 : String = "OZGOKCE"

    //---------------------------------------------------------------------------------------------------------------
    /**
     * Farklı tiplerdeki bir degiskenin onune String bir degisken ya da ifade koyarak toplarsanız, sonuc String olacaktır.
     * Ancak String bir degisken ya da ifadenin sonuna + operatoru ile farklı bir tip eklerseniz, hata alırsınız.
     */

    val numbersValue : String=  "value" + (2+3+4)  // value9
    val numbersValue2 : String=  "value" + 2 + 3 + 4  // value234
    //val numbersValue3 : String=  2 + 3 + 4 + "value"  // error

    //---------------------------------------------------------------------------------------------------------------

    /**
     * Herhangi bir degisken + operatore ihtiyac duyulmadan direkt olarak "" icine yazilabilir.
     * Bunun yerine sadece $ isareti kullanilir. Bu yapıya String Template denir.
     * Eğer değişkenin bir özelliğe sahipse, özelliğin adı ${} içine yazılır.
     */

    val name2 = "Oguzhan"
    val age = 25
    println(" ${name2.length}, $age ")

    //---------------------------------------------------------------------------------------------------------------

    /**
     * Row String: 3 tırnak arasına yazılan her şeyi olduğu gibi alır.
     * trimIndent() fonksiyonu ile satır başındaki boşlukları siler.
     * trimMargin() fonksiyonu ile satır başındaki belirtilen karakteri siler.
     */
    val rawPineTree = """
        *
       ***
      *****
     *******""".trimIndent()
    println(rawPineTree)

    val rawPineTree2 = """
        *
       ***
      *****
     *******""".trimMargin()
    println(rawPineTree2)

    //---------------------------------------------------------------------------------------------------------------

    /**
     * String format ile degiskenlerin degerleri yazdirilabilir.
     * 2f : Son iki basamak ondalikli sayi demektir.
     */

    val age2 = 25
    val newMessage = String.format("I am %d years old", age2)
    println(newMessage)

    val newNumber = 123412312.92
    val usFormat = String.format(Locale.US, "%,.2f", newNumber)
    println(usFormat)
    val localTR = Locale("tr", "TR")   // Türkçe dili için locale oluşturduk.
    val usFormat2 = String.format(localTR, "%,.2f", newNumber)  // Türkçe locale ile formatladık.
    println(usFormat2)

    // 4342 4564 2343 5462 -> Credit Card Number Format
    val creditCardNumber = 1234905678123423
    // 4 basamaklı gruplar halinde yazdırmak için
    val formattedCreditCardNumber = String.format("%d", creditCardNumber).replace(Regex("(.{4})"), "$1 ")
    println(formattedCreditCardNumber)

    //---------------------------------------------------------------------------------------------------------------

    //Her harf kac kez tekrar ediyor?

    val awesomeKekod1 = "Kekod iss Awesomme"
    val charArray = awesomeKekod1.toCharArray()
    val charMap = mutableMapOf<Char, Int>()
    for (char in charArray) {
        if (charMap.containsKey(char)) {
            charMap[char] = charMap[char]!! + 1
        } else {
            charMap[char] = 1
        }
    }
    println(charMap)


}