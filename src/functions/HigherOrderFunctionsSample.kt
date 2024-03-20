package functions

// Code with ♥️
// Created by Oguzhan OZGOKCE 


fun main() {
    val tShirtScreen = TshirtScreen()
    tShirtScreen.tshirtAdapter.onClilkTshirtItem(1)
    calculateAndPrintNormal(5, 3, '+')
    calculateAndPrintNormal(5, 3, '-')
    calculateAndPrintNormal(5, 3, '*')

    calculateAndPrint(5, 3) { numberOne, numberTwo -> numberOne + numberTwo }
    calculateAndPrint(5, 3) { numberOne, numberTwo -> numberOne - numberTwo }
    calculateAndPrint(5, 3) { numberOne, numberTwo -> numberOne * numberTwo }
    calculateAndPrint(5, 3) { numberOne, numberTwo -> numberOne / numberTwo }

}

class TshirtScreen() {
    val tshirtAdapter = TshirtAdapter()

}

class TshirtAdapter() {
    fun onClilkTshirtItem(tShirtId: Int) {

    }
}

//------------------------------------------------------------------------

fun calculateAndPrintNormal(numberOne: Int, numberTwo: Int, operation: Char) {
    val result = when (operation) {
        '+' -> numberOne + numberTwo
        '-' -> numberOne - numberTwo
        '*' -> numberOne * numberTwo
        '/' -> numberOne / numberTwo
        else -> throw IllegalArgumentException("Unknown operation")
    }
    println("Result: $result")

}


//operation : Fonksiyon gibi tanımlanmış bir değişken
fun calculateAndPrint(numberOne: Int, numberTwo: Int, operation: (numberOne: Int, numberTwo: Int) -> Int) {
    val result = operation(numberOne, numberTwo)
    println("Result: $result")
}

fun calculateAndPrint2(
    numberOne: Int,
    numberTwo: Int,
    operation: (numberOne: Int, numberTwo: Int, foo: () -> Unit) -> Int
) {
    //val result = operation(numberOne, numberTwo)
    //println("Result: $result")
}

fun calculateAndPrint3(numberOne: Int, numberTwo: Int, operation: (numberOne: Int, numberTwo: Int) -> () -> Int) {
    val result = operation(numberOne, numberTwo)
    println("Result: $result")
}

//------------------------------------------------------------------------


//fun foo(){
//    println("Hello")
//}

