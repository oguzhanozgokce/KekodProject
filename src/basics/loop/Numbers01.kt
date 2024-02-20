package basics.loop

// Code with ♥️
// Created by Oguzhan OZGOKCE

fun main() {

    /**
     *          Type    |       Size(Bits)        |       Min Value         |       Max Value
     *          ---------------------------------------------------------------------------------
     *          Byte    |       8                   |       -128                |       127
     *          Short   |       16                  |       -32768              |       32767
     *          Int     |       32                  |       -2_147_483_648       |       2_147_483_647
     *          Long    |       64                  |       -9_223_372_036_854_775_808       |       9_223_372_036_854_775_807
     *          Float   |       32                  |       1.4E-45             |       3.4028235E38
     *          Double  |       64                  |       4.9E-324            |       1.7976931348623157E308
     *          Char    |       16                  |       '\u0000'           |       '\uffff'
     *          Boolean |       1                   |       false               |       true
     *          ---------------------------------------------------------------------------------
     *          UByte   |       8                   |       0                   |       255
     *          UShort  |       16                  |       0                   |       65535
     *          UInt    |       32                  |       0                   |       4_294_967_295
     *          ULong   |       64                  |       0                   |       18_446_744_073_709_551_615
     *
     */

    //---------------------------------------------------------------------------------------------------------------

    /**
     * Tip çıkarımı (Type Inference) : Bir degsiken tipinin Esitligin sag tarafındaki  value bakarak IDE'nin tipini belirlemesidir.
     * Tip çıkarımı (Type Inference) sırasında eger sayı Int ifaden buyuk degilse tipi default olarak Int olur.
     * Tip çıkarımı (Type Inference) sırasında eger sayı Int ifaden buyukse tipi default olarak Long olur.
     *
     */

    val minByte: Byte = Byte.MIN_VALUE
    val maxByte: Byte = Byte.MAX_VALUE

    val minShort: Short = Short.MIN_VALUE
    val maxShort: Short = Short.MAX_VALUE

    val minInt: Int = Int.MIN_VALUE
    val maxInt: Int = Int.MAX_VALUE

    val minLong: Long = Long.MIN_VALUE
    val maxLong: Long = Long.MAX_VALUE

    val minFloat: Float = Float.MIN_VALUE
    val maxFloat: Float = Float.MAX_VALUE

    val minDouble: Double = Double.MIN_VALUE
    val maxDouble: Double = Double.MAX_VALUE

    println("minByte: $minByte")
    println("maxByte: $maxByte")
    println("minShort: $minShort")
    println("maxShort: $maxShort")
    println("minInt: $minInt")
    println("maxInt: $maxInt")
    println("minLong: $minLong")
    println("maxLong: $maxLong")
    println("minFloat: $minFloat")
    println("maxFloat: $maxFloat")
    println("minDouble: $minDouble")
    println("maxDouble: $maxDouble")

    //---------------------------------------------------------------------------------------------------------------

    /**
     * Long      degiskeni tanımlarken sonuna "L" eklenir.
     * Float     degiskeni tanımlarken sonuna "F"  ve  "f"  eklenir.
     *
     */

    val longNumber = 100L
    val floatNumber = 100.0F
    val floatNumber2 = 10f
    val binaryNumber = 0b10100011
    val hexNumber = 0x0F

    //---------------------------------------------------------------------------------------------------------------

    /**
     * Number degisken tanımi yapilirken underscrore "_" kullanilabilir.
     */

    val number = 1_000_000
    val creditCardNumber = 1234_5678_9012_3456L

    //---------------------------------------------------------------------------------------------------------------

    /**
     * Boxed    : Degiskenin obje referansı olarak tutulmasidir  : Primitive tip
     * Unboxed  : Degiskenin primitive tip olarak tutulmasidir  : Referans tip
     * ===      : Memory'deki Referans karsilastirmasi yapar
     * ==       : Deger karsilastirmasi yapar
     */

    val a: Int = 100
    val boxedNumber: Int = a
    val anotherBoxedNumber: Int = a
    println("boxedNumber === anotherBoxedNumber: ${boxedNumber === anotherBoxedNumber}")   // true

    // True cikmasinin sebebi: 100 degeri -128 ile 127 (Byte aralıgı) arasinda oldugu icin ayni referansi tutarlar.

    val b: Int = 10000
    val boxedNumber2: Int = b
    val anotherBoxedNumber2: Int = b
    println("boxedNumber2 === anotherBoxedNumber2: ${boxedNumber2 === anotherBoxedNumber2}")   // false

    /**
     * İs gorusmesi sorusu:
     * İki sekilde soru sorulabilir:
     * === neyi kontrol edersiniz?
     * Kotlinde primitive tipdeki bir degisken nullable yapılır ve === ile kontrol edilirse, nasıl bir sonuc alınır?
     */

    val age: Int? = 100

    /**
     * // age Steak'te tutulur - 100 degeri heapte tutulur.
     * // yani degisken null olursa steak' de ismi tutulur, heap'de boş bir alan olur.
     * primitive degisken kendisi ve degeri stack'te tutulur.
     * referans degiskeni kendisi stack'te, degeri heap'te tutulur.
     */
}