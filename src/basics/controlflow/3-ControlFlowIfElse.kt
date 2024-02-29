package basics.controlflow

import java.io.IOException

// Code with ♥️
// Created by Oguzhan OZGOKCE 


fun main() {
    /**
     * if - else caseleri 2 kullanımı vardır. State  ve expression kullanımı
     * Basitçe State kullanımı : if (condition) { } else { }
     * Expression kullanımı : val result = if (condition) { } else { }
     */

    //state kullanımı
    println(" Are yıu student : Yes or No ")
    val state = readlnOrNull()

    if (state == "Yes") {
        println("Welcome to the student")
    } else {
        println("Welcome to the guest")
    }

    // tavsiye edilmez
    if (state?.contains("Yes", ignoreCase = true)!!) println("Welcome to the student")
    else println("Welcome to the guest")

    // tavsiye edilmez
    if (state == "Yes") println("Welcome to the student") else println("Welcome to the guest")

    //expression kullanımı
    val result : String = if (state == "Yes") {
        "Welcome to the student"
    } else {
        "Welcome to the guest"
    }
    println(result)  // Welcome to the student

    //--------------------------------------------------------------------------------

    /**
     * Kotlin de if-else'lerin expression kullanımından otürü ternary operator yoktur.
     */

    val isStudent = false
    val isStudent2 = if (isStudent) "Yes" else "No"
    // val isStudent2 = isStudent ? "Yes" : "No" // Java'da bu şekilde kullanılır.

    //--------------------------------------------------------------------------------

    /**
     *  2 farklı number tipindeki değişkenin karşılaştırırken equals fonksiyonu önce tipleri karşılaştırdığı için eger tipleri farklı ise hata verir.
     */

    // if(10 == 10L) println("Equals") else println("Not Equals") // Not Equals
    if(10.toLong() == 10L) println("Equals") else println("Not Equals")

    //--------------------------------------------------------------------------------

    /**
     * Birden fazla şartlı durumumuz varsa bunların her birini, aşağıdaki gibi, ayrı ayrı if şeklinde yazmak
     * if - else şeklinde yazmaktan daha kötü performans almamıza sebep olur. Çünkü her bir if durumu kontrol edilir.
     */

    val  number = 10

    if (number == 10) {
        println("Number is 10")
    }
    if (number == 20) {
        println("Number is 20")
    }
    if (number == 30) {
        println("Number is 30")
    }
    //------------------------------------------

    if (isStudent){
        println("Student")
    } else {
        otherMethod()
    }

    // Yukarıdaki kodun daha performanslı  ve daha temiz hali
    if (isStudent) {
        println("Student")
        throw IOException()
        return
    }
    otherMethod()

    //--------------------------------------------------------------------------------




}

private fun otherMethod() {
}