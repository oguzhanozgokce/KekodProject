package classes

// Code with ♥️
// Created by Oguzhan OZGOKCE 

/**
 * Public: Herhangi bir kısıtlama olmadan her yerden erişilebilir.
 * Private: Sadece tanımlandığı sınıf içerisinden erişilebilir.
 * Protected: Sadece tanımlandığı sınıf içerisinden ve bu sınıftan türetilen sınıflardan erişilebilir.
 * Internal: Sadece tanımlandığı modül içerisinden erişilebilir.
 *
 */
//constructor
class Turtle(
    var feetCount: Int = 4,
    val feetColor: String = "Black",
    val headColor: String = "Green",
    val shelterColor: String = "Brown",
    val tailCount: Int = 1,
    val tailColor: String = "Green",
    val age: Int = 10,
    val name: String = "Turtle",
    val isAlive: Boolean = true

    // var veya val yazmamızın sebebi Primary Constructor'da tanımlı olan değişkenlerin class içerisinde kullanılabilmesi için.
) {

    //init block: Primary Constructor'dan sonra çalışan bloktur. Yani Primary Constructor'ın body si. Her bir instance oluşturulduğunda çalışır.

    init {
        println("Turtle is created")

    }


    fun makeASound(): String {
        return "Turtle Sound"
    }

    fun eatMeal(meal: String): String {
        return "Turtle is eating $meal"
    }

    fun swim(): String {
        return "Turtle is swimming"
    }


}

fun main() {
    val turtle: Turtle = Turtle()
    val makeAsound = turtle.makeASound()
    val eatMeal = turtle.eatMeal("Fish")
    val swim = turtle.swim()
    turtle.feetCount = 5
    val turtle2 = Turtle(4, "Black", "Green", "Brown", 1, "Green", 10, "Turtle", true)
    val turtle3 = Turtle(4, "Black")
    val turtle4 = Turtle(4, "Yellow",  "Green", "Red", 2, "Green", 20, "Turtle", true)


    /**
     * Android de context : Bir activity, service, broadcast receiver, content provider gibi componentlerin birbirleri ile iletişim kurmalarını sağlayan bir yapıdır.
     * (Activity, Service, Broadcast Receiver, Content Provider) -> Android
     *
     */
}