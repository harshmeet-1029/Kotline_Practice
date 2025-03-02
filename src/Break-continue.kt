fun main() {
    println("\n<============= Break ==========>\n")
    for (i in 1..10) {
        println(i)
        if (i == 5) {
            break
        }
    }
    println("\n<============= Continue ==========>\n")
    for (i in 1..10) {
        if (i == 5) {
            continue
        }
        println(i)
    }
}