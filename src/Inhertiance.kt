/*
IInheritance means inheriting the properties and methods of the parents class in the child class

#styanx
 we use open key word for making the class as open to use as inheritance

 open class <Parent class>{
    code
    code2
 }

 class <child class>:<Parent class name>(){
     code
     code2
     }
 */

open class ParentClass {
    var car: String = "I20"
    var money: Int = 120000000
    fun disp() {
        println("Father Car $car")
        println("Father Car $money")
    }
}

class ChildClass : ParentClass() {
    var bike: String = "kawaski"
    fun show() {
        println("Son $bike")
    }
}

fun main() {
    var obj = ChildClass()
    obj.disp()
    obj.show()
    obj.money = 300000
    obj.disp()
    obj.show()


}