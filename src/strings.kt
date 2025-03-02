fun main() {
    /*
    * Strings
    * Strings are immutable
    *
    * Once it is initialize you can not change the value of the string or assign a new string
    * All the operations happen on strings return a new string obj and does not change the existing one
    *leaving the original one untouched
    * */

    val str = "Hello"
    println(str)
    print("\n<========== Accessing the single value of the string  ===============>\n")
    // str_name[index]
    println(str[1])

    // string concatenation
    // we use + for this
    val s1 = "hey"
    val s2 = " Harsh"
    println(s1 + s2)
    println("This is " + s1 + s2)
    println("100" + 20) // over here it converted the 20 to string
    //    println(20 + "100") // but over here 20 which is int first so it give error
    // string literals
    println("Hey,\nhow are you")
    // Raw strings
    val raw_string = """Hey 
        How are u you 
    """
    println(raw_string)
    println(raw_string.indices)

    // string templates
    print("this is string: ${raw_string.uppercase()}")
}