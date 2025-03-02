fun main() {
    /*
    * loop -> it is something which keeps on going again and again
    *
    * Kotlin have 3 loops
    * 1. For loop
    * 2. while loop
    * 3. do while loop
    * */

    /*
    * For loop
    * for (<var_name> in collection){
    *   code
    *   code
    * }
    * */

    for (i in 1..5) {
        println(i)
    }

    println("Reverse")
    for (i in 5 downTo 1) {
        println(i)
    }


    /*
    * While loop
    * while (condition){
    *   code
    * }
    * */
    var x = 0
    while (x <= 10) {

        print("x: $x ${if (x == 10) "" else ","}  ")
        x++;
    }
    println()
    /*
    * do while in this code will run one time no matter what
    * do {
    * code
    * }while(condition){
    * code
    * }
    * */
    var j = 0
    do {
        j++
        println(j)
    } while (j < 10)
}