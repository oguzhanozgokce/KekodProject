package classes

// Code with ♥️
// Created by Oguzhan OZGOKCE 

// Bir class'i abstract kw kullanmadan nesnesinin olusturulmasini nasil engelleyebilirim ?
// Default olan bos constructor'ını private'e cekip,herhangi bir secondary constructor yazmaz isek engelleyebiliriz.

fun main() {
   val customer = Customer("oguzhan")
    println(customer.customerKey)

    val person2 = Person2("OGUZHAN")
    println(person2.name)

    val person3 = Person3("buse", "ozgokce", 18)
    println(person3.fullName)

    val person04 = Person4("oguzhan","ozgokce",25)
    println(person04.fullName)

    val person14= Person4("oguzhan","ozgokce",25,true)
    println(person14.fullName)

}

class Documentation {
}

class Person{

}

class Person1 constructor(firstName: String){

}

class Person2(firstName: String){
    val name = firstName.lowercase()
}


class Empty

class Customer(name : String){
     val customerKey = name.uppercase()
}


class Person3(val firstName: String, val lastName: String, var age: Int){
    val fullName = "$firstName $lastName $age"
}

class Person4(
    val firstName:String,
    val lastName: String,
    val age:Int ,
    val isEmployed : Boolean = false){

    val fullName = "$firstName $lastName $age $isEmployed"
}

//-*--------------------------------------------------------------------------------------------------*-
// Inheritance

class Example : Any(){
    override fun hashCode(): Int {
        return super.hashCode()
    }
}

open class Bae(){

}
open class Derived : Bae(){

}


