fun main() {
    /*
    * Functions -> Functions are  used to make the code reusable and divide in block
    *
    * There are 5 types of functions
    * 1. Function without argument and without return type
    * 2. Function with argument and without return type
    * 3. Function without argument with return type
    * 4. Function with argument and with return type
    * 5. Function with named argument
    * ----- How to create function
    * we use fun keyword for it
    * */
    add()
    add(12, 23)
    add1(19)
    add1(20, 230)
    println(add2())
    println(add2(20, 30))
    println(nameAdd(b = 20, a = 30)) //now b will have 20 and a will have a

    println("Lambda function ${addLambda(20, 50)}")
    println("Lambdra function sum  ${sumLambda(40, 70)}")
}


//  Function without argument and without return type
fun add() {
    val a = 10
    val b = 20
    println(a + b)
}

// Function with argument and without return type
fun add(a: Int, b: Int) {
    println(a + b)
}

// With default argument
fun add1(a: Int, b: Int = 0) {
    println(a + b)
}

//Function without argument with return type
fun add2(): Int {
    val a = 10
    val b = 20
    return (a + b)
}

//  4. Function with argument and with return type
fun add2(a: Int, b: Int = 0): Int {

    return (a + b)
}

// Function with named argument
fun nameAdd(a: Int, b: Int): Int {
    return (a + b)
}


// Lambda functions
var addLambda = { a: Int, b: Int -> a + b }

var sumLambda: (Int, Int) -> Int = { a, b -> a + b }
