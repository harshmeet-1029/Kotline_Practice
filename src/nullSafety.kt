fun main() {
    var name: String = "Harsh"
    //It does not allow Null value
    //name = null // it will give error
    println(name)
    var name2: String? = "meet"
    println(name2)
    //It will now allow null values
    name2 = null
    println(name2)

    val name1Length = name.length
    println(name1Length)

    // Now this will give error
    //Only safe (?.) or non-null asserted (!!.) calls are allowed on a nullable receiver of type String?
    // val name2Length = name2.length

    // How to find length
    // Option1: Check for null values
    val name2Length = if (name2 != null) name2.length else -1
    println(name2Length)

    //Option2: Safe call
    val name2LengthOp2 = name2?.length
    println(name2LengthOp2)

    // Option3: The !! Operator
    // It is not null assertion operator (!!) converts any value to the non-null
    // Type and throw an exception if value is null
    name2 = "singh"
    val name2LengthOp3 = name2!!.length
    println(name2LengthOp3)


}