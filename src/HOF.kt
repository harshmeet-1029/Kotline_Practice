fun main() {

    println(HOF(12, 23, ::sub)) // :: is to pass callback
    println(HOF(11, 23, { a: Int, b: Int -> a + b }))
}

fun sub(a: Int, b: Int): Int {
    return a + b
}

fun HOF(a: Int, b: Int, callback: (Int, Int) -> Int): Int {
    return callback(a, b)
}