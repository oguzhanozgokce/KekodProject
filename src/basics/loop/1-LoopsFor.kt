package basics.loop

// Code with ♥️
// Created by Oguzhan OZGOKCE 


fun main() {
    /**
     *  3 farklı şekilde for tanımlanabilir.
     *  value in list           şeklinde value değerlerini alabiliriz.
     *  index in list.indices   şeklinde index değerlerini alabiliriz.
     *  (index, value) in list.withIndex()   şeklinde index ve value değerlerini alabiliriz.
     */

    /**
     * !!!!!!! Desctructuring declaration : Bir listede bulunan elemanları key ve value olarak ikili şekilde almamazı sağlar. !!!!!!!
     */

    for (value :Int in 1..10) {   // Float verirsek hata alırız. Kapalı tip dönüşümü yapılmaz.
        println(value)
    }
    println("----------------")

    val countryCode = arrayOf("tr", "us", "de", "fr")
    for (index in countryCode.indices) {
        println(countryCode[index])
    }
    println("----------------")

    for ((index, value) in countryCode.withIndex()) {
        println("$index -> $value")
    }
    println("----------------")

    val alphabetList = listOf('a', 'b', 'c', 'd', 'e')

    for(alphabet: Char in alphabetList){    // Type inference olduğu için Char yazmamıza gerek yoktur.
        println(alphabet)
    }
    println("----------------")
    for (index in alphabetList.indices) {  // index
        println("$index -> ${alphabetList[index]}")
    }
    println("----------------")
    for ((index, value) in alphabetList.withIndex()) {   // Desctructuring declaration
        println("$index -> $value")
    }
    println("----------------")

    for (value : Char in 'a'..'z'){    // a'dan z'ye kadar
        println(value)
    }
    //--------------------------------------------------------------------------------

    /**
     * repeat fonksiyonu ile belirli bir işlemi belirli bir sayıda tekrarlayabiliriz.
     */

    repeat(10){
        println("Hello")
    }

    //--------------------------------------------------------------------------------

    /**
     * return kullanarak ilgili sart sağlanırsa döngüyü sonlandırabiliriz.
     * countinue kullanarak ilgili sart sağlanırsa döngünün bir sonraki adımına geçebiliriz.
     * break kullanarak döngüyü sonlandırabiliriz.
     */

    for (i in 1..10){
        if (i == 5)
            break
        println(i)
    }
    println("End of the loop")

    for (i in 1..10){
        if (i % 2 == 1)
            continue
        println(i)
    }

    returnLabel@ for (i in 1..10){
        for (j in 1..10){
            if (i == 5 && j == 5)
                continue@returnLabel
            println("$i - $j")
        }
    }

    returnLabel@ for (i in 1..10){
        for (j in 1..10){
            if (i == 5 && j == 5)
                break@returnLabel
            println("$i - $j")
        }
    }
}