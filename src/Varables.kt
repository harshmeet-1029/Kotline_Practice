fun main() {
    //variables in kotlin
    /* we need to use var
    * the syntax to declare the variables are
    *
    * var <var_name>:<datatype(it is in Title case only, and it is optional)> = <value>
    *
    *  Var
    * It is a general variable.
    * The value of a variable that is declared using var can be changed anytime throughout the program.
    *  var is also called mutable and non-final variable, as there value can be changed anytime.
    *
    * VAL(Value)
    * val
    * The object stored using val cannot be changed, it cannot be reassigned, it is just like the final keyword in java. val is immutable.
    * Once assigned the val becomes read-only, however, the properties of a val object could be changed,
    * but the object itself is read-only.
    * */
    val name: String = "Harsh" //This also words
    var age = 23 //this also works it should be short
    age = 24
    println("Hey $name how are u, are you of $age")

}