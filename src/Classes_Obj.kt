/*
* Class -> it is the blueprint of anything we can create the basic structure of anything and use the class to create new things
* Always put the class Name capital
* we use class keyword to create it
* */
class Mobile {
    // Properties
    var model: String = "Viva"
    var price: Float = 10500.00F

    fun modelInfo() {
        println("Model = $model")
        println("Price = $price")
    }
}

fun main() {
    // Creating obj or class
    val obj = Mobile()
    obj.modelInfo() // Calling the method of class
    // Actually we can change the value from outside also
    obj.model = "Samsung"
    obj.price = 12.23F
    obj.modelInfo() // Calling the method of class
}
