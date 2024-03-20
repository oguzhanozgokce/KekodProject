package basics.loop

// Code with ♥️
// Created by Oguzhan OZGOKCE 


fun main() {
    /**
     * While = For + If
     *
     * While Kullanımı: Belirli bir koşul sağlandığı sürece döngü devam eder. Koşul sağlanmazsa döngü sonlanır.
     * while(koşul) {
     *     // Koşul sağlandığı sürece çalışacak kod bloğu
     *     }
     *    ----------------------------------------------------------------
     *     do-while : while'dan farklı olarak koşul sağlanmasa bile en az bir kere çalışır.
     *     do {
     *     // Koşul sağlanmasa bile en az bir kere çalışacak kod bloğu
     *     } while(koşul)
     *
     */

    var number = 0
    while (number < 10) {
        println(number)
        number++
    }

    println("----------------")

    for (value in 0..10) {
        if (value < 5) {
            println(value)
        }else{
            break
        }
    }
    println("----------------")




}