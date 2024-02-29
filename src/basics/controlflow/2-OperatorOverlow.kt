package basics.controlflow

// Code with ♥️
// Created by Oguzhan OZGOKCE 


data class PairNumber(val numberOne: Int, val numberTwo: Int) {

    /**
     * minus operator overloading : fonksiyonun yaptığı işlem : PairNumber class'ın içinde minus operator fonksiyonunu kendim yazarak
     * yine bir class beklediğimi söylüyorum(PairNumber) budurumda PairNumber nesnesinden başka bir PairNumber nesnesi çıkaracağımı belirtiyorum.
     *
     * Kendi class değişkeninden parametre olarak gelen PairNumber nesnesinin değişkenlerini çıkart bu sonucu PairNumber nesnesi olarak döndür.
     */
    operator fun minus(pairNumber: PairNumber): PairNumber {
        val localNumberOne = numberOne - pairNumber.numberOne
        val localNumberTwo = numberTwo - pairNumber.numberTwo
        val returnPairObject = PairNumber(localNumberOne, localNumberTwo)
        println("Result : ${returnPairObject.numberOne} - ${returnPairObject.numberTwo}")

        return returnPairObject
    }

    operator fun plus(value: Int): Int {
        return numberOne + value
    }

    operator fun plus(pairNumber: PairNumber): PairNumber {
        val localNumberOne = (numberOne + pairNumber.numberOne)
        val localNumberTwo = (numberTwo + pairNumber.numberTwo)
        val avgResult = PairNumber(localNumberOne, localNumberTwo)
        println("Result : ${avgResult.numberOne} + ${avgResult.numberTwo}")
        return avgResult
    }

}


fun main() {
    val a = 10
    val b = 5

    //operatorler arka planda esleniğini cağırır.
    var result = a + b
    result = a.plus(b)

    val pairNumberOne: PairNumber = PairNumber(10, 5)
    val pairNumberTwo = PairNumber(-5, 2)

    val resultOne = pairNumberOne.numberOne - pairNumberTwo.numberOne
    val resultTwo = pairNumberOne.numberTwo - pairNumberTwo.numberTwo
    println("Result : $resultOne - $resultTwo")

    pairNumberOne.minus(pairNumberTwo)
    println("${pairNumberOne.minus(pairNumberTwo)}")

    val resultThree = pairNumberOne + 5
    println("Result : $resultThree")

    pairNumberOne + pairNumberTwo
    pairNumberOne.plus(pairNumberTwo)

}