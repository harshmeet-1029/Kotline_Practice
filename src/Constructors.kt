/*
* Creating constructor of class -> it is something which gets called whenever we create the obj of class
*  Types of constructor
*  1. Primary
*  2. Secondary
* */

// Primary Constructor
/*
* Syntax to create the primary constructor
*
* class <class_name> constructor<It is optional>(<variable name if we use val it will use val else it will use var>: <Datatype>){
*     //properties
*
*       // Member
* }
*
* */

class Person constructor(val name: String, val age: Int, var id: Byte) {
    val gender: String = "Male"

    fun display() {
        println(gender)
        println(name)
        println(age)
        println(id)
    }
}

class Human(name: String, age: Byte) {
    var hName: String 
    var hAge: Byte 
    val gender: String 

    init { // It is a special function which is used to initialize the values in the class and it gets called automatically when we create the obj of class like in pythong we have __init__
        hName = name 
        hAge = age 
        gender = "Male" 
    }

    fun disp() {
        println("Name=$hName")
        println("Age=$hAge")
        println("Gender=$gender")
    }
}

// Secondary Constructor
/*
*
*class <class_mame>{
* // Properties
* constructor(<variable name if we use val it will use val else it will use var>: <Datatype>){
* code
*
* }
* //Members
* }
*
* */

class Person2 {
    val gender = 'M'
    var name: String 
    var hage: Byte 


    constructor(name: String, age: Byte) {
        println("C called")
        this.name =
            name  // In order to tell that the name i am assigning is the properties we need to use this keywords
        hage = age 
    }

    fun disp() {
        println("Name: $name")
        println("Age: $hage")
        println("Gender: $gender")
    }
}

class PrimarySeconadry(email: String, password: String) {

    // Properties
    var hName: String = ""
    var hAge: Int? = null
    var hEmail: String = email 
    var hPassword: String 
    var gender: String = "Male"

    //Secondary constructor
    constructor(name: String, age: Int, email: String, password: String) : this(email, password) {
        println(name)
        println(age)
        println(email)
        println(password)
        hName = name 
        hAge = age 
    }

    init {
        hPassword = password
    }

    fun disp() {
        println("------------------------------")
        println("Name: $hName")
        println("Age: $hAge")
        println("Gender: $gender")
        println("Email: $hEmail")
        println("Password: $hPassword")
    }
}

fun main() {
    // Primary Constructor
    val obj = Person("Harsh", 23, 1)
    obj.gender
    obj.display()
    obj.id = 127
    println("<---------------------------->")
    obj.display()

    println("<-------------Another method using init --------------->")
    val hob = Human("Harsh", 23)
    hob.disp()
    hob.hAge = 24
    println("<---------------------------->")
    hob.disp()
    println("<-------------Secondary Constructor --------------->")
    // Secondary Constructor
    val obj2 = Person2("Harsh", 23)
    obj2.disp()
    println("<-------------Primary & Secondary Constructor --------------->")
    val obj3 = PrimarySeconadry("Harsh", 23, "test@gmail.com", "123")
    obj3.disp()
}

