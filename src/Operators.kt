fun main() {
    /*
    * ----- Operators in Kotlin -----
    * Arithmetic operator
    * Relation operator
    * Assignment operator
    * Unary operator
    * Logical operator
    * Bitwise operator
    */
    println("\n<============= Arithmetic operator ===================>\n")
    /*
    * Arithmetic operator
    * Add (+) or a.plus(b)
    * Sub (-) or a.minus(b)
    * Mul (*) or a.times(b)
    * Divide (/) or a.div(b)
    * Modulus (%) or a.rem(b)
    * */
    val a = 20;
    val b = 30;
    println("a+b $a $b");
    println("Add: ${a + b}")
    println("Add func ${a.plus(b)}")
    println("Sub: ${a - b}")
    println("Sub func ${a.minus(b)}")
    println("Mul ${a * b}")
    println("Mul func ${a.times(b)}")
    println("Div ${a / b}")
    println("Div func ${a.div(b)}")
    println("Mod ${a % b}")
    println("Mod func ${a.rem(b)}")
    print("Range: ${b..a}") // It is range
    for (i in a..b) {
        println(i)
    }
    println("\n<============= Relational Operator ===================>\n")
    /*Relation operators are the operations which help us to compare two values together
    * it returns us True or false
    *Operators	Meaning	                    Expression	Translate to
    *   >	    greater than	            a > b	    a.compareTo(b) > 0
    *   <	    less than	                a < b	    a.compareTo(b) < 0
    *  >=	    greater than or equal to	a >= b	    a.compareTo(b) >= 0
    *  <=	    less than or equal to	    a <= b	    a.compareTo(b) <= 0
    *  ==	    is equal to	                a == b	    a?.equals(b) ?: (b === null)
    *  !=	    not equal to	            a != b	    !(a?.equals(b) ?: (b === null)) > 0
    * */
    var c = 30;
    val d = 30;
    println("Greater than ${d > c}")
    println("Less than ${d < c}")
    println("Greater than or equal ${c >= d}")
    println("Less than or equal ${c <= d}")
    println("Equal to ${c == d}")
    println("not Equal to ${c != d}")
    println("\n<============= Assignment operator ===================>\n")
    /*
    * Operators	Expression	Translate to
    *  +=	    a = a + b	a.plusAssign(b) > 0
    *  -=	    a = a – b	a.minusAssign(b) < 0
    // *=	    a = a * b	a.timesAssign(b)>= 0
    *  /=	    a = a / b	a.divAssign(b) <= 0
    *  %=	    a = a % b	a.remAssign(b)
    * */

    println("assignment Op ---")
    c += 1;
    println(c)
    c -= 1;
    println(c)
    c *= 1;
    println(c)
    c /= 1;
    println(c)
    c %= 1;
    println(c)
    println("End---")
    println("\n<============= Unary operator ===================>\n")
    /*
    *  Operator Expressing
    *  ++         ++a or a++
    *  --         --a or a--
    * */
    var k = 10
    println(k++)
    println(++k)
    print("\n<============= Logical Operators ===================>\n")
    /*
    *   Op  Meaning
    *   &&  If both the conditions are ture it will return True else false
    *   ||  If either one of the condition is true then it will return true else false
    *    !  if the condition return true it will make it false and vise versa
    * */
    k = 20
    c = 40
    println("\n<-------- Add Op ----------->\n")
    println("&& op ${(k < c && k >= c)}")
    println("&& op ${(k < c && k <= c)}")
    println("\n<-------- OR Op ----------->\n")
    println("|| op ${(k < c || k >= c)}")
    println("|| op ${(k < c || k <= c)}")
    println("\n<-------- Not Op ----------->\n")
    println("! op ${!(k < c || k >= c)}")
    println("! op ${!(k < c && k >= c)}")

}