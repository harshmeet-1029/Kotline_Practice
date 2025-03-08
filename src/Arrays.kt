fun main() {
    /**---------- Array is used to store multiple types of data into single variable ----------*/

    /*
    * 1. Array is ordered: We can access the single value of the array using its index
    * 2. Array can have duplicate values: Array can have duplicate values
    * 3. Array is homogenous and heterogeneous -> I can store same type of data also and I can not store the same type of data
    * 4. Array is partially mutable -> array have fixed size so we can not add more elements, but we can update the value and remove the value
    * */
    println("<============= Method one:arrayOf() ================>")
    // Method one
    // using arrayOf()
    val data = arrayOf("Harsh", 23, 'M',"Harsh")

    println(data)
    println(data[0])
    println(data[1])
    println(data[2])
    println("<----- Accessing  the value of array ------>")
    //--------------------------------
    for (item in data) {
        println(item)
    }
    println("<----- Displaying array ------>")
    println("<-- Displaying array using its indices -->")
    for (item in data.indices) {
        println("${item} -> ${data[item]}")
    }
    println("<-- Displaying array using .size -->")
    for (item in 0..data.size - 1) {
        println(data[item])
    }
    println("<-- Displaying array using forEachIndexed -->")
    data.forEachIndexed { index, value ->
        println(index)
        println(value)
    }
    println("<-- Displaying array using forEach-->")
    data.forEach { value ->
        println(data.indexOf(value))
        println(value)
    }


    println("<============= giving data type to array ================>")
    val data2 = arrayOf<String>("Harsh", "Panda", "Apple", "Jake") // Giving specific datatype
    println(data2[0])
    // How to update the value of array
    println("<----- Updating the value of array ------>")
    data2[0] = "Harshmeet Singh"
    println(data2[0])
    println("<============= Method of array ================>")
    /*
    * Methods of the array
    *  1. set(index,value) -> at which index I want to store the value
    *  2. get(index) -> it will get the value from that index
    *  3. .size -> get the size of array
    *  4. indexOf(value) -> find the index of that value
    * */

    println("<----- Set Method ------>")
    data2.set(0, "Singh")
    println(data2[0])
    println("<----- Get Method ------>")
    println(data2.get(1))
    println("<----- Size Method ------>")
    println(data2.size)
    println("<----- indexOf Method ------>")
    println(data2.indexOf("Singh"))

    println("<============= Method one:Array Constructor ================>")
    /*
    * Array constructor is also used to create the array
    * Array(size,Function)
    * over here we are using lambda function so I think array is a HOF which will take one argument and callback function and keep on calling that function
    * till the size of it and passing the updated value to that callback function and creating the new array
    *
    * There are some of the Other factory methods available for creating arrays:
    *
    *   byteArrayOf()
    *   charArrayOf()
    *   shortArrayOf()
    *   longArrayOf()
    * */
    val roll = Array(5, { i -> i * 2 })
    for (item in roll) {
        println(item)
    }

    println("<============= How to take INPUT From user using Array ================>")
    print("How many student u want to enter: ")
    val noOfStudent = readLine()!!.toInt()
//    println("Enter the student name: ")
    val names = Array(noOfStudent) { print("Enter the name: ");readLine() }
    for (item in names) {
        println(item)
    }
}