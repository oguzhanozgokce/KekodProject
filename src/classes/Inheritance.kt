package classes

// Code with ♥️
// Created by Oguzhan OZGOKCE 


open class Animal( open val name1 : String){
    var name : String = ""
    var feetCount : Int = 4
    var origin : String = "Pomeranian"
    var tailShape : String = "Curly"
    var color : String = "White"

    open fun makeSound() : String{
        return ""
    }

    fun attack() : String{
        return ""
    }

    fun eat() : String{
        return ""
    }

    fun drink() : String{
        return ""
    }

}

class Dog() :Animal("Pomeranian"){

    override fun makeSound() : String{
        return "Hav Hav"
    }
}

class Cat(override val name1: String) : Animal(name1){
    override fun makeSound() : String{
        return "Miyav"
    }
}

fun main() {
    val animal = Animal("Pomeranian")
    val dog = Dog()
    val cat = Cat("van cat")
    dog.name = "Pomeranian"
    dog.feetCount = 4
    dog.origin = "Pomeranian"
    dog.tailShape = "Curly"
    dog.color = "White"
    dog.makeSound()
    dog.eat()
    dog.drink()
    dog.attack()
    dog.attack()
    cat.attack()
}

/**
 * Final keywordü, private ve open keyword' ü nedir ?
 * open, final gibi class'ın önüne getirebileceğimiz keywordler access modifier'lardır. Visibility modifier'lar gibi class'ın erişimini kısıtlamazlar.
 * Visibility modifier'lar  ne demek? Eğer bir classın önüne open keyword'ü koyarsak bu class başka child classlar tarafından miras alınabiliyor demektir. Eğer bir değişkennin önüne open keyword'ü koyarsak bu değişken başka classlar tarafından override edilebiliyor demektir.
 * final keyword'ü ise bir classın önüne koyduğumuzda bu class başka classlar tarafından miras alınamaz demektir. Bir değişkenin önüne koyduğumuzda bu değişken başka classlar tarafından override edilemez demektir.
 */

/*open class BaseFragment (val layoutId: Int): Fragment{}
   fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // Inflate the layout for this fragment
        val view = inflater.inflate(layoutId, container, false)
    }
}
class DashboardFragment : BaseFragment(R.layout.fragment_dashboard) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // Do something
    }
}

class ProfileFragment : BaseFragment(R.layout.fragment_profile) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // Do something
    }
}*/
