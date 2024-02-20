package basics.loop

// Code with ♥️
// Created by Oguzhan OZGOKCE 

// Baslangic noktasi
fun main() {

    /**
     * Arreyler MUTABLE' DIR.
     */

    /**
     *  Aynı türden  ya da belirtililen türün alt türlerinden oluşan veri gruplarıdır.
     *  En sık kullanılan versiyonları Object-Type Array ve Primitive-Type Array'dir.
     *
     *  Eğer  primitive tipleri Object-Type Array'de kullanırsanız Boxed kullanımı olur.
     *
     *  arrayOf() -> Aynı tip degerler seklinde dizi olusturur.
     *  arrayOf<Any>() -> Farklı tip degerler seklinde dizi olusturur.
     *  arrayNulls<Type>(size) -> Belirtilen boyutta, null degerlerden olusan dizi olusturur.
     *  emptyArray<Type>() -> Belirtilen tipde, bos dizi olusturur.
     */

    val studentNumbers = arrayOf(1, 2, 3, 4, 5)
    val studentNames = arrayOf("Oguzhan", "Ahmet", "Mehmet", "Ali", "Veli")
    val firstCharNames = arrayOf('O', 'A', 'M', 'A', 'V')
    val mixedArray = arrayOf<Any>(1, "Oguzhan", 'O', 2.5, true)    // boxed kullanımı

    val arrayOfNulls = arrayOfNulls<Int>(5) // [null, null, null, null, null]
    println(arrayOfNulls.joinToString())
    val emptyArray = emptyArray<Int>() // []
    val emptyArray2: Array<String> = emptyArray() // []

    /*----------------------------------------------------------------------------------------------*/

    /**
     * Arrayler sabit büyüklüktedir. Arrey'lere ekleme ve çıkarma yapmak aynı String'lerde olduğu gibi
     * memory'de yeni bir Array oluşturulmasına neden olur.
     */

    var citiesArray = arrayOf("Ankara", "Istanbul", "Izmir", "Bursa", "Antalya")
    citiesArray += "Adana" // [Ankara, Istanbul, Izmir, Bursa, Antalya, Adana]
    //citiesArray -= "Istanbul" // [Ankara, Izmir, Bursa, Antalya, Adana]

    /*----------------------------------------------------------------------------------------------*/

    /**
     * Array<Type>(size){highOrderFunction} şeklinde de oluşturulabilir.
     * highOrderFunction -> index: Int -> Type
     * Bu durum da highOrderFunction son satira denk gelen degerler dizi olusturur.
     */

    val carNamesMini = Array<Double>(5) { it * 2.5 }  // [0.0, 2.5, 5.0, 7.5, 10.0]
    for (carName in carNamesMini) {
        print("$carName ")
    }

    //Pek kullanılmaz
    val carNames = Array<Unit>(10) {
        println(it * it).toString()
    }

    /*----------------------------------------------------------------------------------------------*/

    /**
     * ByteArray, ShortArray, IntArray, LongArray, FloatArray, DoubleArray, BooleanArray, CharArray
     * gibi primitive tiplerin Array versiyonlarıdır.
     *    .toTypedArray() fonksiyonu ile Object-Type bir array  Primitive-Type array'e dönüştürülebilir.
     */

    val firstCharOfCountries = charArrayOf('T', 'U', 'R', 'K', 'E', 'Y')
    firstCharOfCountries[0] = 'A'
    println(firstCharOfCountries.joinToString())

    val charSample : CharArray = arrayOf('A', 'B', 'C').toCharArray()
    println(charSample.joinToString())

    /*----------------------------------------------------------------------------------------------*/

    /**
     *  val ile tanımlanmış bir array'in herhangi bir index'indeki deger degistirilebilir
     *  val indexdeki degerlerin degismesine karısmaz.
     *  Ancak ilgili diziyi baska bir dizi ile esitlenmesine izin vermez.
     */

    val numbers = arrayOf(1, 2, 3, 4, 5)
    numbers[0] = 10
    numbers[1] = 20
    println(numbers.joinToString())
    // numbers = arrayOf(10, 20, 30, 40, 50) // error

    /*----------------------------------------------------------------------------------------------*/

    /**
     * 2 Boyutlu Array'ler
     */

    val twoDimensionalArray = Array(2) { Array(2) { 0 } }
    println(twoDimensionalArray.contentDeepToString())  // [[0, 0], [0, 0]]

    val threeDimensionalArray = Array(3) { Array(3) { Array(3) { 0 } } }
    println(threeDimensionalArray.contentDeepToString())

    val simpleArray = arrayOf(1,2,3)
    simpleArray[0] = 10
    twoDimensionalArray[0][0] = 10
    threeDimensionalArray[0][0][0] = 10

    println(twoDimensionalArray[0][0].toString())  // 10

    //Aynı zaman da arreyler üst class'ları yerine atanamazlar. (invariant)
    val arrayOfString : Array<String> = arrayOf("Oguzhan", "Ahmet", "Mehmet", "Ali", "Veli")
    //val arrayOfAny : Array<Any> = arrayOfString // error
    val arrayOfAny: Array<Any> = arrayOf("Oguzhan", "Ahmet", "Mehmet", "Ali", "Veli")

    /*----------------------------------------------------------------------------------------------*/




}

