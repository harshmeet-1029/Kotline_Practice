/*
Exception Handling

try{
code
}catch(e:Exception){
code
}

or it can return the value too

val result =  try{
value}catch(e:Exception){
e.message
}
 */

fun main() {
    try {
        val a = 110 / 0
        println(a)
    } catch (e: Exception) {
        println(e.message)
    } finally {
        println("It will always run")
    }
    println("<======== Another method =============== >")
    val result = try {
        val a = 110 / 1
        a
    } catch (e: Exception) {
        e.message
    } finally {
        println("It will always run")
    }

    println(result)
}
