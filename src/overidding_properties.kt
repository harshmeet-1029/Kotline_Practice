// Overriding of Methods and Properties

open class ParentClass4 {
    open var car: String = "I20" // I need to make it open for that
    var money: Int = 120000000

    open fun disp() {
        println("Father Car $car")
        println("Father money $money")
    }
}

class ChildClass4 : ParentClass4() {
    var bike: String = "kawaski"
    override var car: String = "BMW" // we need to override it so for that i will use override keyword

    // WE USE SUPER KEYWORD TO ACCESS THE PARENT CLASS PROPERTIES
    var fcar: String = super.car

    fun show() {
        println("Farther car from child $fcar")
        println("Son $car")
        println("Son $bike")
    }

    override fun disp() {
        println("Override disp")
        println("Father Child Car $car")
        println("Father Child money $money")
    }
}

fun main() {
    var obj = ChildClass4()
    obj.disp()
    obj.show()
}
