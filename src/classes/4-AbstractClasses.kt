package classes

// Code with ♥️
// Created by Oguzhan OZGOKCE

/**
 * Abstract class lar final olamazlar yani başka bir sınıf tarafından extend edilebilirler.
 * Abstract class lar primary ve secondary constructorlar alabilirler ama nesne oluşturulamazlar.
 *  primary ve secondary constructor olmasının sebebi ise içerde kullanacağımız başka bir classın instance'ı olucaksa bunu inject etmek için kullanabiliriz.
 *  Abstract classların içersinde normal bir değişken tanımlayabiliyoruz (Abstract class lar state tutabilirler)
 *  State de tutabildiğim değişkeni open da yapabilirim
 *  Abstract property' i  initil değer veremiyorum
 *  Abstract class ların içinde Normal fonsiyon yazabilirim (Override edilmesi beklenmeyen)
 *  Abstract class ların içinde Open fonsiyon yazabilirim (Body  olması zorunda) (Override edilmesi optional)
 *  Abstract class ların içinde Abstract fonsiyon yazabilirim (Body olması yasak) (Override edilmesi zorunlu)
 */


abstract class Human(val name: String) {

    abstract var surname: String
    abstract val middleName: String
    open val age: Int = 24
    val eyeColor: String = "Blue"


    fun normalFun() {

    }

    open fun openFun() {

    }

    abstract fun abstractFun()


}


abstract class Turk(override val middleName: String = "zxczxc") : Human("Arda") {
    abstract val skinColor: String
    override fun abstractFun() {
        TODO("Not yet implemented")
    }

    override var surname: String = "axczczxc"


}

open class Kurt() : Human("asdasd") {
    override var surname: String = "asdasdzxc"


    override val middleName: String
        get() = TODO("Not yet implemented")

    override fun abstractFun() {
        TODO("Not yet implemented")
    }

}

class ChildTurk(override var surname: String) : Turk() {
    override val skinColor: String = "axcasd"
}

class ChildKurt() : Kurt() {
    override var surname: String
        get() = super.surname
        set(value) {}
}

fun main() {
val childTurk = ChildTurk("Işıtan")
    val childKurt = ChildKurt()
    println(childTurk.name)
    println(childTurk.surname)
    println(childTurk.middleName)
    println(childTurk.age)
    println(childTurk.eyeColor)
    println(childTurk.skinColor)

    println(childKurt.name)
    println(childKurt.surname)
    println(childKurt.middleName)
    println(childKurt.age)
    println(childKurt.eyeColor)
    childKurt.abstractFun()


}