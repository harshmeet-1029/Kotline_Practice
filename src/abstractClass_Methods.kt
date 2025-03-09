/*
Abstract class is the class whose instance can not be created they are made to be the Parent class of some another class
Syntax
use abstract keyword

abstract class <class_name>{
code
}
* */

abstract class Father1 {

    var car = "Alt 100"

    fun disp() {
        println("Father car: $car")
    }

    // Abtract methods
    abstract fun hello()  // whenever we create the abstract class
// we keep the body of it as empty so that we can fill it in the child class

}

class Child1 : Father1() {
    fun show() {
        println("Father car: $car")
    }

    override fun hello() { // We use override keyword here to use it
        println("Father car: $car")
    }
}

fun main() {
    var obj = Child1()
    obj.show()
    obj.disp()

//    var obj1 = Father1() We can not do this as it is abstract class

}