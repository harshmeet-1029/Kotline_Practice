fun main() {
    /*
    if expression
    if is used with the condtional op and it will only work if its condtion is true
    if (condtion)
    {
        code
        code
    }else{
    If the if condition fails
    }
    * */

    var a = 20
    var b = 10
    if (a > b) {
        println("A is greatest")
    }
    if (a < b) {
        println("B  is greatest")
    } else {
        println("A is greater in else")
    }

    if (a == b) println("both are equal")
    else println("Not True both are not equal")

    // Or
    var max = 0
    max = if (a < b) {
        a
    } else {
        b
    }
    println(max)

    max = if (a < b) a else b

    println(max)
}