import java.util.Scanner

fun main() {
    /*
    *
    * How to take input from user
    * # Method one
    * using readLine()
    * */
    anotherMethod()
    val name: String? =
        readLine() // that question mark is for null safty and
    // we put string just to make sure that it is string but it is useless becuase by default it ttake as string
    val age = readLine() // that question mark is for null safty and
    //How to check the datatype of it
    println(name)
    println(name!!::class.simpleName)
    println(age)
    println(age!!::class.simpleName)

    // How to tell user what to print
    print("Enter your name: ")
    val name2 = readLine()
    println("Name: $name2")

    // Typecasting to take int input
    print("Enter Roll number: ")
    val Roll = readLine()!!.toInt()
    println("Roll: $Roll")
    println(Roll!!::class.simpleName)

}


// ------------------ ANOTHER METHOD USING SCANNER CLASS
fun anotherMethod() {
    // using scanner class
    val scanner = Scanner(System.`in`) // we use java thing over here
    print("Enter your name: ")
    val name2 = scanner.next()
    println("Name: $name2")
    println(name2::class.simpleName)
    print("Enter your roll: ")
    val roll2 = scanner.nextInt()
    println("Roll: $roll2")
    println(roll2::class.simpleName)
}