fun main() {
    /*
    * List -> it is used to store the collection of data in it
    * 1. it is ordered
    * 2. it is mutable // The listOf is not at all mutable  but mutableListOf() is mutable
    * 3. Homogeneous
    * 4. can store duplicates
    * it is mostly same like the list of pythong
    *
    * # How to create the list
    *  we use listOf() to create the list
    *  listOf(item1,item2,item3,....,itemN)
    *   mutableListOf(item1,item2,item3,....,itemN)
    * */

    val data = listOf("Harshmeet", "Singh", 1029, 'M')
    //  val data = listOf<String>("Harshmeet", "Singh")
    println(data)
    println("<========== Access the single value of the list ===============>")
    //we use
    // list_name[index]
    // list_name.get(index)
    println(data[0])
    println(data[1])
    println(data[2])
    println(data[3])
    println(data.get(2))
    for (item in data) {
        print("${item} ->")
    }
    println("\n<----- Check the size of the list ----->")
    println(data.size)
    println("\n<----- Diffrent methods to print the lists ----->")
    // For loop
    for (item in data) {
        print("${item} ->")
    }
    println()
    // using indices
    for (item in data.indices) {
        print("${data[item]} ->")
    }
    println()
    // Using .size
    for (item in 0..data.size - 1) {
        print("${data[item]} ->")
    }
    println()
    // using forEachIndexed
    data.forEachIndexed { index, value -> print("${value} -> ${index} - ") }
    println()
    data.forEach { value ->
        print("${value} -> ")
    }
    println("\n<========== Creating the mutable list ===============>")
    val data2 = mutableListOf("Harshmeet", "Singh", 1029, 'M')
    println(data2)
    println("<========== Updating the value of the list ===============>")
    data2[0] = "Harsh"
    println(data2)
    println("<========== Adding the value of the list ===============>")
    // list_name.add(index,value)
    data2.add(2, "testing")
    println(data2)
    println("<========== Removing the value of the list ===============>")
    // list_name.removeAt(index)
    data2.removeAt(2)
    println(data2)

    println("<============= How to take INPUT From user using Array ================>")
    print("How many student you want to enter: ")
    val noOfStudent: Int = readLine()!!.toInt()
    val students = List(noOfStudent) { print("Enter the name: ");readLine() }
    println(students)
}