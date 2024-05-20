package classes

// Code with ♥️
// Created by Oguzhan OZGOKCE 

//Interface'leri constructorları olmaz.
//Constructor'ları olmadığı için de nesne oluşturulamaz.
//Fakat intercaleri implement eden classlar nesne oluşturulabilir.
// Object expression kullanarak interface'lerden nesne oluşturulabilir. Bu da interface'in içerisindeki fonksiyonların override edilmesi zorunluluğunu getirir.
// public default değeri, private internal da olabilir.
// Open fun yazarsak anlamı olmaz çünkü interface'ler zaten override edilmek zorunda.
// Final fun yazarsak hata alırız çünkü interface'ler zaten override edilmek zorunda ve final olamazlar.
// Body verirsek override edilme zorunluluğu kalkar.

// Bir fonksiyon yazılıcaksa bunu abstract class da mı interface de mi yazmalıyız ?
// -> Bunu eğerki o finksiyon child classlarda override edilmesini istemiyorsak abstract class da yazmalıyız. Eğerki bu fonksiyonun child classlarda override edilmesini istiyorsak interface de yazmalıyız.


//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

// Abstract classlar ve interface'ler arasındaki farklar İS GORÜSMESİ ÇOK ÖNEMLİ BİR CEVAP OLACAK*******
// İnterface'ler state tutamazlar. (val text: String ="asdasd") olamaz(Backing field yoktur) ama abstract classlar state tutabilirler.(Backing field vardır)
// Fakat kotlinde companion object vardır ve interface'lerde companion object tanımlanabilir. (val name: String = "Arda") gibi.
// Peki companion object nedir? companion object, bir sınıfın instance'ı olmadan çağrılabilen bir objedir. Yani bir sınıfın içindeki static değişken ve fonksiyonlar için kullanılır.

interface TextWatcher {


    fun afterTextChanged(text: String)
    fun beforeTextChanged(text: String)
    fun onTextChanged(text: String)

    fun funWithBody() {}


    val text: String
    var text2: String

    companion object {
        var name: String = "Arda"
    }
}


interface ChildInterface : TextWatcher {
    override fun onTextChanged(text: String) {}

    override fun beforeTextChanged(text: String) {}

    override fun afterTextChanged(text: String) {}


}

class InterfaceSample() : ChildInterface {

    override fun beforeTextChanged(text: String) {
        super.beforeTextChanged(text)
    }

    override val text: String = "asdasd"

    override var text2: String = "xzczxc"


}

// Object expression kullanımında arka planda textWatcher'in(interfacenin) nesnesi olusturulur.
// Interface'in içerisine yazılan tum fonksiyonların override edilme zorunlulugu yoktur.
// Basitce o fonksiyona body verirsek override edilme zorunlulugu kalkar.
// Fonksiyonun body'si yok ise override edilme zorunlulugu vardir.
// Eger interface'nin icerisine body'si olan bir fonksiyon tanimlarsak,arka planda statik bir class icerisinde statik bir fonksiyon tanimlamis oluruz.

fun main(args: Array<String>) {

    val textWatcher = object : TextWatcher {
        override fun afterTextChanged(text: String) {
            TODO("Not yet implemented")
        }


        override fun beforeTextChanged(text: String) {
            TODO("Not yet implemented")
        }

        override fun onTextChanged(text: String) {
            TODO("Not yet implemented")
        }

        override val text: String
            get() = TODO("Not yet implemented")
        override var text2: String
            get() = TODO("Not yet implemented")
            set(value) {}

    }


}