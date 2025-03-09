/*
Data class is basically used to hold the data in it nothing much
we use data keyword to create it

data class <classname>()
* */

data class Employee(val name: String, val age: Int)

fun main() {
    val emp = Employee("Harsh", 23)
    println(emp.name)
    println(emp.age)
    println(emp)
    println(emp.toString())

    // How to de-structure data class
    // datatype(values) = <obj>
    val (name, age) = emp
    println(name)
    println(age)
}