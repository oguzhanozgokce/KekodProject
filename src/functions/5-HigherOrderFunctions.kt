package functions

// Code with ♥️
// Created by Oguzhan OZGOKCE

// command . -> //
// option + command + L -> Reformat Code
// option + command + / -> /* */

/**
 * Functions: Kotlinde "FİRST CLASS CITIZEN" yani değişkenlere atanabilen, fonksiyonlara parametre olarak verilebilen ve fonksiyonlardan dönebilen bir yapıdır.
 *
 * Higher Order Functions: Diğer fonksiyonları parametre olarak alan veya döndüren fonksiyonlardır.
 *
 * Yapısal Olarak;
 *
 * fun <fonksiyonAdi>(parametre: (parametreTipi) -> dönüşTipi) : dönüşTipi {
 * example
 * fun foo(normalFunction:(message:String) -> Unit){
 *     normalFunction("Hello")
 * }
 *
 * fun foo(boo:String){
 * }
 *
 * Cağrılırken;
 * fun main(){
 * foo({message -> println(message)})
 *
 */
fun main() {

    /**
     * Higher Order Functions Tanımlamanın 3 farklı yolu vardır.
     * 1. Normal fonksiyon tanımlama : Bir değişkene atanabilir.
     * 2. Lambda fonksiyon tanımlama
     * 3. Anonymous fonksiyon tanımlama : İsmi olmayan fonksiyonlardır. Normal fonksiyona parametre olarak verilebilir.
     */

    val hihgerOrderFunciton = { surName: String ->
        "Hello $surName"
    }

    val numberOne = readLine()!!.toInt()
    val numberTwo = readLine()!!.toInt()
    val operation: String = readLine()!!

    // +, -, *, /
    val sumFunction = { numberOne: Int, numberTwo: Int ->
        numberOne + numberTwo
    }
    // invoke : çağırmak
    sumFunction.invoke(numberOne, numberTwo)
    //Anonymous
    val minusFunction = fun(numberOne: Int, numberTwo: Int): Int {
        return numberOne - numberTwo
    }
    //Expression body
    val mulFunction = fun(numberOne: Int, numberTwo: Int): Int = numberOne * numberTwo


    when (operation) {
        "+" -> calculateAndPrint(numberOne, numberTwo, sumFunction)
        "-" -> calculateAndPrint(numberOne, numberTwo, minusFunction)
        "*" -> calculateAndPrint(numberOne, numberTwo, mulFunction)
        "/" -> calculateAndPrint(numberOne, numberTwo, ::divFunction)  // Bu yöntem en çok kullanılan yöntemdir.
        "%" -> calculateAndPrint4(numberOne, numberTwo, ::modFunction2)
        else -> throw IllegalArgumentException("Unknown operation")
    }

    //Anonymous
    val anonymousFunction = fun(surName: String): String {
        return "Hello $surName"

    }
    
    //------------------------------------------------------------------------
    
    calculateAndPrint6(numberOne = 4, numberTwo = 6, operation = { numberOne, numberTwo ->
        println(this + " " + (numberOne + numberTwo))
        50
    })

}

fun divFunction(numberOne: Int, numberTwo: Int): Int {
    return numberOne / numberTwo
}

fun modFunction2(numberOne: Int, numberTwo: Int): Int = numberOne % numberTwo


//Değişken isimleri vermemize gerek yoktur. Çünkü onları fonksiyonun içinde kullanmayacağız.
fun calculateAndPrint4(numberOne: Int, numberTwo: Int, operation: (Int, Int) -> Int) {
    val result = operation(numberOne, numberTwo)
    println("Result: $result")
}

// HOF' na default değer vermek
fun calculateAndPrint5(
    numberOne: Int = 3,
    numberTwo: Int = 4,
    operation: (Int, Int) -> Int = ::divFunction
) {
    val result = operation(numberOne, numberTwo)
    println("Result: $result")
}

fun calculateAndPrint6(
    numberOne: Int = 3,
    numberTwo: Int = 4,
    operation: String.(Int, Int) -> Int
) {
    val result = operation("", numberOne, numberTwo)
    println("Result: $result")
}


//------------------------------------------------------------------------

/**
 * Bir higher order function' na parametre verirken Class ismi.() şeklinde tanımlanır
 * Bu sayede ilgili class da parametre parantezi içerisinde yazilabilir.
 */
