package classes

// Code with ♥️
// Created by Oguzhan OZGOKCE

/**
 * Kotlinde classlar default olarak final,Javada ise classlar default olarak open durumundadir.
 * Open:Miras alinabilir,Final:Miras alinamaz demektir.
 * Eger sahip oldugumuz ozellikler veya fonksiyonlar(degerleri farkli olabilir) baska classlarda da varsa,ust bir class
 * olusturup,o classa ilgili ozellikleri ve fonksiyonlari yazdiktan sonra child classlar tarafindan miras alinmasini saglayabiliriz.
 * Bu sayede asagidaki ornekteki gibi child classlarda ayni fonksiyonlari ve ozellikleri tekrar tekrar yazmaya gerek kalmadan inheritance sayesinde
 * parent classı miras alıp,direk olarak kullanabiliriz.
 * Burda onemli olan ozelliklerin veya fonksiyonlarin ayni olmasidir.Elbette value'lari classimiza gore degisebilir
 */

/**
 * Miras almada birinci amacimiz ust classin butun ozelliklerini kullanabilcek sekilde child classlar olusturmaktir.
 * Ikinci amacimiz Ust classda olmasini istemeyecegimiz ancak child classda olmasini isteyecegimiz ozellikler olursa child class olusturabiliriz,miras almayi yapariz.
 * Ucuncu olarak Ust classlarda sahip oldugumuz yetkinlikleri child classlarda degistirmek isteyebiliriz.
 */

/**
 * MÜLAKAT SORUSU GELEBİLİR !!
 * Final ve Open keywordleri nedir ?
 * Bunlara Accesibility Modifier denir.Open veya final kullanmamiz miras alinmayla ilgili bir durumdur.
 * Eger biz bir classin onune open koyarsak o classin miras alinabilecegi anlamina gelir.
 * Eger biz bir degiskenin veya fonksiyonun onune open koyarsak bu durumda da o degisken child classlarda override edilebilir anlamina gelir.
 * (Dinamik Polymorphism )

 * Ayni sekilde biz bir classin onuna Final koyarsak ki Kotlinde default olarak classlar Final durumundadir, bu durumda
 * bu class miras alinamaz demektir.
 * Eger bir degiskenin veya fonksiyonun onune Final koyarsak ki Kotlinde default olarak degiskenler ve fonksiyonlar final durumundadir,bu durumda bu degisken veya fonksiyon child classlarda
 * override edilemez anlamina gelir.
 */

/**
 * MÜLAKAT SORUSU GELEBİLİR !!
 * Polymorphism Nedir ?
 * Cevap: Polymorphism basitce ust classta bulunan bir degiskeni veya fonksiyonu,override ederek anlamini veya gorevini
 * degistirerek child classlarda kullanmaktir.Bu durumda override edecegimiz fonksiyonunu veya degiskenin onune open
 * keywordunu koymamiz gerekir.
 * Dynamic Polymorphism ve Static Polymorphism olmak üzere ikiye ayrılır.
 */


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
