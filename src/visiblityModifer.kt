/*
Visibility Modifier

1. private: Visible inside this class only (including all its members).
2. protected: Protected is same as private along with that its subclasses.
3. internal: The internal modifier restricts the visibility of a member to the same module.
 A module is a set of Kotlin files compiled together.
4. public: The public modifier makes a member visible to any code. This is the default visibility for members in Kotlin.
* */

open class Father {
    private var a = 1 // It will not at all accessible outside this class even if i inheatrete  it
    var b = 1 // It can be accessible in this class and in child class but not outside of it
    internal var c = 1 // It can be accessible anywhere in this module but not anywhere else
    var d = 1

    //Memeber function
    fun disp() {
        println("A: $a")
        println("B: $b")
        println("C: $c")
        println("D: $d")
    }

    protected fun hello() {
        println("Hey how are u")
    }
}

class Son : Father() {

    var _bike = "Kawasaki"

    fun show() {
//        println("A: $a") Can't Access it as it is private
        println("B: $b")
        println("C: $c")
        println("D: $d")
        hello()
    }
}


fun main() {
    val obj = Son()
    obj.show()
    obj.disp()
    //obj.a = 101 Can't Access it as it is private
    //obj.b = 102 Can't Access it as it is protected
    obj.c = 103
    obj.d = 104
    obj.show()
    obj.disp()
//    obj.hello() Can't Access it as it is private

    val obj1 = Father()
    //obj1.a = 101 Can not use as it is private
    //obj1.b = 292 Can not use as it is Protected
}