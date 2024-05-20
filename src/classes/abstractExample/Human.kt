package classes.abstractExample

// Code with ♥️
// Created by Oguzhan OZGOKCE 


/*abstract class Human(val name : String, val eventManager : EventManager) {

    abstract val surName : String ="Default Surname"
    open val age : Int = 0

    fun sendEvent(event : Event){
        eventManager.sendEvent(event)
    }

    abstract fun getFullName() {
        return "$name $surName"
    }

    abstract fun geTAge() = age
}

fun main() {

}*/

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