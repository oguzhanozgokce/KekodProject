package basics.controlflow

// Code with ♥️
// Created by Oguzhan OZGOKCE 


fun main() {
    var numberOne = 12
    val numberTwo = 7
    println("NumberOne : ${numberOne}")  // 12
    println("NumberOne: ${numberOne++}") // 12
    println("NumberOne: ${numberOne}")  // 13
    println("NumberOne: ${++numberOne}") // 14

    /**
     * plus ile + işleminin ayrımı : İki degiskende Nullable oldugu durumlarda plus kullanılabilir.
     * Nullable değilse  + kullanılır iş hayatında.
     */

    println("NumberOne: ${numberOne + numberTwo}") // 21
    println(numberOne.plus(numberTwo)) // 21
    println(numberOne.minus(numberTwo)) // 7
    println(numberOne.times(numberTwo)) // 84
    println(numberOne.div(numberTwo)) // 2
    println(numberOne.rem(numberTwo)) // 5

    println("----------------------------------")

    println("Final notunu giriniz:")
    val charNote = when (val grade: Int? = readlnOrNull()?.toInt()) {
        100 -> {
            "$grade = A "
        }

        in 80..99 -> {
            "$grade = B "
        }

        in 60..79 -> {
            "$grade = C "
        }

        in 40..59 -> {
            "$grade = D "
        }

        else -> {
            "$grade = F "
        }
    }
    println(charNote)
    println("----------------------------------")

    //compareTo
    val number = 20
    val number2 = 8
    println(number.compareTo(number2)) // 1 -> number > number2
    println(number2.compareTo(number)) // -1 -> number2 < number
    println(number.compareTo(number)) // 0 -> number = number

    //equals
    val number3 = 20
    val number4 = 20
    println(number3.equals(number4)) // true  equals : ==
    println(number3.equals(number2)) // false

    println("----------------------------------")

    var a = 20
    var b = 5
    a += b
    println("a+=b : $a") // 25
    a -= b
    println("a-=b : $a") // 20
    a *= b
    println("a*=b : $a") // 100
    a /= b
    println("a/=b : $a") // 20
    a %= b
    println("a%=b : $a") // 0

    /**
     * a+=b -> a.plusAssign(b)
     * a-=b -> a.minusAssign(b)
     * a*=b -> a.timesAssign(b)
     * a/=b -> a.divAssign(b)
     * a%=b -> a.remAssign(b)
     */


    println("----------------------------------")

    var n1 = 10
    var n2 = 5

    println("+n1 : " + +n1) // 10    -> Pozitif olduğunu belli eder
    println("-n2 : " + -n2) // -5
    println("++n1 : " + ++n1) // 11
    println("--n2 : " + --n2) // 4
    println("n1++ : " + n1++) // 11
    println("n2-- : " + n2--) // 4
    println("n1 : " + n1) // 12
    println("n2 : " + n2) // 3


}