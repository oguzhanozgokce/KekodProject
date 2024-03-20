package functions

// Code with ♥️
// Created by Oguzhan OZGOKCE 


fun main() {
    /**
     * Uzerinde değişiklik yapamadığımız (readOnly) classlara ya da yapmak istemediğimiz classlara, bu classların
     * içerisinde yazmadan da fonksiyon ekleyebiliriz. Bu fonksiyonlara Extensions Functions denir.
     * Bunu yaparken unutmamamız gereken; yazdığınız extencions fonksiyon aslında o sinifin gerçek bir fonksiyonu değildir. Sadece o sinifin bir üyesi gibi davranır.
     *
     * Yapisal olarak;
     *
     * fun <SinifAdi>.<fonksiyonAdi>(parametre: <tip>) : <dönüşTipi> {
     * fun String.extPrint(handsomeValue : HandsomeOne): Unit{
     *
     * }
     */

    //Arka plan da nasıl çalışır?

    //Normalde değişkenlere değer atayip, print işlemini aşağıdaki gibi yaparız.
    val pi: Double = 3 + 0.14
    println(pi)

    val schoolNumber : Int = 1453
    println(schoolNumber)

    val tcIdentityNumber : Long = 12345678910
    println(tcIdentityNumber)

    // Yukaridaki kullanimlarin yerine normal bir log 2 fonskiyonu yazabilir
    // ve bu fonksiyonu herhangi bir class'a aitmiş gibi kullanabiliriz.

    log2(pi, "Double")
    log2(schoolNumber, "Int")
    log2(tcIdentityNumber, "Long")

    //--------------------------------------------------------------------------------

    //extension fonskyioblar ister direkt value'lar üzrinden çağırabilir

    (3+0.14).log("Double")
    1453.log("Int")
    12345678910.log("Long")

    //istersek değişkenler üzerinden çağırabiliriz.
    pi.log("Double")
    schoolNumber.log("Int")
    tcIdentityNumber.log("Long")

    //--------------------------------------------------------------------------------

    //
    val foo = FOOA()
    foo.fooPrint()

}

infix fun Number.log(emtyParam : String) {             // Number class'ına özel
    println(emtyParam + this)
}

//normal fonksiyon
fun log2(number: Number, messager: String){           // Paremetreden sağlatmış olduk
    println("$number, $messager")
}

class FOOA(){
    infix fun Number.log3(emtyParam : String) {             // Sadece bu class'a özel oldu(Global değildir)
        println(emtyParam + this)
    }

    fun fooPrint(){
        3.log3("Int")
    }
}

/**
 * İŞ GÖRÜŞME SORUUSU
 * Veriable da exten
 */

/**
 * Bir sinfia extension fonksiyon yazilabilidiği gibi extension property de yazilabilir.
 * Bunun sebebi aslinda property'lerin get() ve set() methotlarının olmasidir.
 * Bu extension property'lerin içerisinde field tanimlanmaz.
 * Dolasıyla aslinda gerçek anlamda bir değişken extension yapilmaz.
 */


var Shape.type : String
    get() = type
    set(value) {
        type = value
    }

open class Shape{

    private var intNumber = 0

    fun setNumber(number: Int){
        intNumber = number
    }

    fun main(){
        intNumber.extToString()
        intNumber.log("")
    }

    open fun Int.extToString() {}
}

class Rectangle : Shape(){
    override fun Int.extToString() {
        println("Extension Property")
    }
}