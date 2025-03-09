/*
Inheritance with constructor
* */

// Using Primary Constructor


open class ParentClass1(_car: String, _money: Int) {
    var car: String = _car
    var money: Int = _money
    fun disp() {
        println("Father Car $car")
        println("Father Car $money")
    }
}

class ChildClass1(_car: String, _money: Int, _bike: String) : ParentClass1(_car, _money) {
    var bike: String = _bike
    fun show() {
        println("Son $bike")
    }
}

// Secondary constructor


open class ParentClass2 {
    var car: String
    var money: Int

    constructor(car: String, money: Int) {
        this.car = car
        this.money = money
    }

    fun disp() {
        println("Father Car $car")
        println("Father Car $money")
    }
}

class ChildClass2 : ParentClass2 {
    var bike: String;

    constructor(car: String, money: Int, bike: String) : super(car, money) {
        this.bike = bike

    }

    fun show() {
        println("Son $bike")
    }
}


//Primary && Secondary constructor

open class ParentClass3(_car: String, _money: Int) {
    var car: String = _car
    var money: Int = _money
    fun disp() {
        println("Father Car $car")
        println("Father Car $money")
    }
}

class ChildClass3 : ParentClass3 {

    var bike: String

    constructor(_car: String, _money: Int, bike: String) : super(_car, _money) {
        this.bike = bike
    }

    fun show() {
        println("Son $bike")
    }
}


fun main() {
    var obj = ChildClass1("I20", 20000, "Kawasaki")
    obj.disp()
    obj.show()
    obj.money = 300000
    obj.disp()
    obj.show()
    println("<============== Secondary constructor ================>")
    var obj2 = ChildClass2("I20", 20000, "Kawasaki")
    obj2.disp()
    obj2.show()
    obj2.money = 300000
    obj2.disp()
    obj2.show()
    println("<============== Primary && Secondary constructor ================>")
    var obj3 = ChildClass3("I20", 20000, "Kawasaki")
    obj3.disp()
    obj3.show()
    obj3.money = 300000
    obj3.disp()
    obj3.show()
}