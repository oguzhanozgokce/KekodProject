// Code with ♥️

// Created by Oguzhan OZGOKCE

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Hello, World!")

    val number = 100
    val age = 25
    val name: String = "Oguzhan"
    val isTrue = true
    val pi = 3.14
    val char = 'A'
    val float = 3.14f

    val array: Array<Any> = arrayOf(1, "Oguzhan", true, 3.14, 'A', 3.14f)
    for (i in array) {
        println(i)
    }


    println("Enter two number: ")
    val number1 = readln().toInt()
    val number2 = readln().toInt()
    println("Sum of $number1 and $number2 is ${number1 + number2}")


}

class A {
    var isMale = true
        private set

}

/**
 * Debugging: Neden Kullanilir?
 * Belli bir kod parcasini calistirirken, kodun calisma sirasini, adim adim nasil calistigini,
 * hangi adimda hangi degerin ne oldugunu görmek icin kullanilir.
 */

// Command + option + Shift + L -> Reformat code
// Command + . -> Comment Line or Block
// Shift + Shift + Kotlin Bytecode -> Bytecode -> Decompile -> Java

/**
 * Kotlinde iki tur degisken vardir:
 * 1. Mutable: Degistirilebilir -> var
 * 2. Immutable: Degistirilemez -> val
 */

/**
 * ReadLine() -> Kullanicidan veri almak icin kullanilir.
 */

/**
 * -----------Is gorusmesi sorusu-----------
 * Type Inference: Degiskenin tipini belirtmeden, degiskenin degerine gore IDE'nin  tipini belirlemesidir.
 * Bir değişkene değer atadığımızda o verinin hangi türde olacağını tam olarak belirtmediysek IDE'nin o verinin
 * hangi türde olacağını bilmesidir.
 */

/**
 * val - var hangisi daha hizlidir?
 * Aralarindaki performans farki yok denecek kadar azdir.
 * Ufacik bir performans farki varsa, val degerler daha maliyetlidir.
 * Threading kullanılıyorsa val degerler daha performanslidir.
 */

/**
 * var keyword ' u kullanara nasıl val degiskeni olusturulur?
 * Her bir değişkenimizin arka planda yazılan get() ve set fonksiyonu vardır.
 * set fonksiyonuna private visibility modifier eklenir. Disaridan deger atanamaz olur.
 * private set -> val degiskeni olusturulur.
 */


// readonlly - inMuthable  İş Görüşmesi Sorusudur.
// readonlly ve inMuthable farkı nedir?
// readonly bir değişkeni sadece okunabilir yaparken, inmutable bir değişkeni değiştirilemez yapar.