package classes

// Code with ♥️
// Created by Oguzhan OZGOKCE 


class Encapsulation {
    // Backing Field : Değişkenin değerini tutan gizli bir alandır.
    private val name : String = "Oguzhan"
    var surName : String = "Ozgokce"

    // Backing Field' ı yoktur.
    fun getFullName() : String {
        return "$name $surName"
    }

    fun shotName() : String{
        return "oguz"
    }
}

fun main() {
    val encapsulation = Encapsulation()
    encapsulation.surName = "ozgokce"

}

/**
 * Encapsulation: Bir sınıfın içerisindeki değişkenlerin ve fonksiyonların dışarıdan erişilebilirliğini kısıtlamaktır.
 * Yani değişken oluşturuyoruz fakat nerede kullanılacağını belirtmemeiz gerekir mesela örnek senaryolar
 * Yani kotlinde üye değişken bir classın içerisine bir değişken oluşturduğumuzda aslında basitce get ve set fonksiynolarını oluyşturmuş oluyoruz,
 * Kısa Encapsulation kotlinde tabi ki var  çünkü biz aslında bir üye değişken oluşturduğumuzda bunlar fieald değilde property oluyor(ben bunların get set fonksiynolarını arka planda oluşturmuş oluyorum) Kotlin zaten default olarak encapsulatişon' ı default olarak sağlar.
 */
