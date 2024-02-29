package basics

// Code with ♥️
// Created by Oguzhan OZGOKCE 


fun main() {
    /**
     * Sonlu sayili liste olusturulurken, range kullanilir.
     */

    /**
     *Kucukten buyuge liste olusturmak için;
     * 1..10 -> 1,2,3,4,5,6,7,8,9,10
     * 1.rangeTo(10) -> 1,2,3,4,5,6,7,8,9,10
     * 1 until 10 -> 1,2,3,4,5,6,7,8,9
     * fonksiyonlari kullanilabilir.
     */

    val numbers = 1..10
    val numbers2 = 1.rangeTo(10)  // 1,2,3,4,5,6,7,8,9,10

    val numbersUtil = 1..<10
    val numbersUtil2 = 1.rangeUntil(10)   // 1,2,3,4,5,6,7,8,9

    val alphabet = 'A'..'Z'
    val alphabet2 = 'A'.rangeTo('Z')

    /*----------------------------------------------------------------------------------------------*/

    /**
     * Buyukten kucuge -- operatoru kullanilir.
     */

    val numbersReverse = 10 downTo 1
    val numbersReverse2 = 10.downTo(1)  // 10,9,8,7,6,5,4,3,2,1
    val numbersReverse3 = 10 downTo 1 step 2  // 10,8,6,4,2


    val gradeNumbers = 1..10 step 2
    val gradeNumbers2 = 1.rangeTo(10).step(2)  // 1,3,5,7,9
    val gradeNumbers3 = 10 downTo 1 step 2

    /*----------------------------------------------------------------------------------------------*/

    /**
     * CharRange, IntRange, LongRange isimlerinde özel rangerlar vardir. Progression interface'ini implement ederler.
     */

    val numberList : IntRange = 10..90
    numberList.first    // 10
    numberList.last     // 90
    numberList.step     // 1
    numberList.forEach { print(it) }

    when(10) {
        in numberList -> println("10 is in the list")
        !in numberList -> println("10 is not in the list")
    }

    numberList.count()

    /**
     *     // average, sum, max, min, sort, sorted, sortedDescending, contains, indexOf, lastIndexOf, find, findLast, first, last, firstOrNull, lastOrNull, get, isEmpty, isNotEmpty, random
     */

    val numberList2 : IntRange = 10.rangeTo(90)
    numberList2.random()
    numberList2.average()
    numberList2.sum()
    numberList2.max()
    numberList2.min()
    println("${numberList2.random()}, ${numberList2.average()}, ${numberList2.sum()}, ${numberList2.max()}, ${numberList2.min()}")






}