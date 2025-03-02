fun main() {
    /*  when is basically like the switch statment whcih was in c++
    *  syntax
    *
    * when(expression){
    * expression_value -> code
    * expression_value2 -> code
    * expression_value3 -> code
    * else -> default code
    * }
    * */

    var a = 8
    when (a) {
        1 -> {
            println("One")
        }

        2 -> println("Two")
        3 -> println("Three")
        4, 5 -> println("Four") // if user enter either 4 or 5
        // for giving some range then
        in 7..9 -> {
            println("data " + a)
        }

        else -> println("Put correct one")
    }
}
