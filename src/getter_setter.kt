/*
* Getter and setter they are used to set and get the value from properties
*  get() = field
* set(value){
*   field = value
* }
*
* */

class Person1 {

    var name: String = "Data"
        get() = field
        set(value) {         // setter
            field = value
        }

    // this is the main reason to use getter adn setters
    // we can modify the value before adding it or assinging it
    var age: Int = 23
        get() = field
        set(value) {
            if (value < 0) {
                field = -1
            } else {
                field = value
            }
        }
}

fun main() {
    var obj = Person1()
    println(obj.name)
    obj.name = "Data1"
    println(obj.name)
    println(obj.age)
    obj.age = -3
    println(obj.age)

}