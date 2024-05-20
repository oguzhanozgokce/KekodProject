package classes

// Code with ♥️
// Created by Oguzhan OZGOKCE 


/**
 * Kotlin'de object anahtar kelimesi, singleton nesneleri ve nesne bildirimlerini tanımlamak için kullanılır.
 * Singleton Nesneleri: object anahtar kelimesiyle tanımlanan nesneler, tek bir örneğe sahip olurlar. Bu, Singleton tasarım deseninin Kotlin'deki karşılığıdır.
 *  Bir sınıfın statik üyeleri gibi davranan üyeler tanımlamak için kullanılır
 *  İsim verilmeden, tek bir yerde kullanılmak üzere nesneler oluşturulabilir.
 *
 *
 *
 *
 */

// ---Singleton Nesne Örneği---

object DatabaseManager {
    val name = "DatabaseManager"

    fun connect() {
        println("Connected to the database.")
    }
}

// Kullanımı
fun main() {
    println(DatabaseManager.name)
    DatabaseManager.connect()
}

// ---Companion Object---
//Companion Objects, bir sınıfın içinde tanımlanarak o sınıfın statik üyeleri gibi davranan nesnelerdir

/**
 * class MyClass {
 *     companion object {
 *         const val CONSTANT = "This is a constant"
 *
 *         fun staticMethod() {
 *             println("This is a static method.")
 *         }
 *     }
 * }
 *
 * // Kullanımı
 * fun main() {
 *     println(MyClass.CONSTANT)
 *     MyClass.staticMethod()
 * }
 *
 */


