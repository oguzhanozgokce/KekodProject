package basics

// Code with ♥️
// Created by Oguzhan OZGOKCE 


fun main() {

    /**
     * 8 bit alan kaplar
     *
     * true ya da false deger alabilir.
     * 0 ya da 1 olarak kullanılmaz
     */

    val isTeacher: Boolean = true
    val isStudent: Boolean = false
    val isFirstStudentMale: Boolean? = true

    //---------------------------------------------------------------------------------------------------------------

    /**
     * Boolean degiskenlerde mantiksal operatorler kullanilabilir.
     *
     * && -> and
     * || -> or
     * ! -> not
     */

    if (isTeacher && isStudent) {
        println("Teacher and student")
    }
    if (isTeacher || isStudent) {
        println("Teacher or student")
    }
    if (!isTeacher) {
        println("Not teacher")
    }

    /**
     *  // ve && operatorleri lazily çalışma mantığına sahiptir.
     *  ----- lazily ------ : Sol tarafın sonucuna bakıp sağ tarafı çalıştırmayabilir.
     */

    /**
     * true && true -> true
     * true && false -> false
     * false && true -> false
     * false && false -> false
     *
     * true || true -> true
     * true || false -> true
     * false || true -> true
     * false || false -> false
     *
     * !true -> false
     * !false -> true
     *
     */

    //---------------------------------------------------------------------------------------------------------------

    /**
     *  Boolean degerin true olmasını kontrol ettirmek için == true şeklinde yazmaya gerek yoktur.
     *  Nullable ise bunu yapmak gerekir.
     *
     */

    if (isTeacher) {
        println("Teacher")
    }

    if(isFirstStudentMale == true) {
        println("First student is male")
    }



}