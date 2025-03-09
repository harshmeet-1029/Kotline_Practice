/*
✅ Simple Definition of Interface
👉 Interface is like a contract.
👉 It tells the class what to do, but not how to do it.
👉 The class has to provide the body (implementation) of the functions.

✅ Why Use an Interface?
It helps you define a standard that different classes must follow.
It promotes reusability and code structure.
It allows you to use multiple inheritance in Kotlin.

In interface whatever we make is by default an abstract properties or methods (if we do not give its body) we can define
our own methods too
Syntax
we use interface keyword for it

interface <interface_name>{
code
}
* */

interface Father2 {
    //Properties
    var car: String // this is an abstract variables, and it will be init using its subclass

    fun disp() {
        println("Father: $car") // We can create something like this also
    }

    fun hello() // It is an abstract functions
}

class Son2 : Father2 {
    override var car = "I20"

    override fun hello() {
        println("Father Child: $car")
    }
}

fun main() {
    val obj = Son2()
    obj.disp()
    obj.hello()
}