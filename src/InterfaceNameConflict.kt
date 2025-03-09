/*
Interface with named conflict

It means that when we have function of same class then which one should we call how i will know
* */

interface A {
    fun callMe() {
        println("Call me from class A")
    }
}

interface B {
    fun callMe() {
        println("Call me from class B")
    }
}

class C : A, B {
    override fun callMe() {
//        callMe() Now over here how compiler would know that whcih call me to call so we use SUPER KEYWORD
        super<A>.callMe() // We are calling Interface A call me
        super<B>.callMe()
        println("Call me from class C")
    }
}


fun main() {
    val obj = C()
    obj.callMe()
}