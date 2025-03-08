fun main() {
    /*
    * Sets -> they are used to store the collection of data in them in unique form
    * 1. Set is unordered
    * 2. Set stores the unique value
    * 3. Set is mutable
    * 4. Set can be homogenous or heterogeneous
    *
    * // How to create the set
    *
    * setOf(item1,item2,item3,...,itemN)
    * mutableSetOf(item1,item2,item3,...,itemN)
    * */
    val data = setOf("Harsh", "Meet", "Singh", "Harsh", 1029, 'M')
    println(data)
    println(data.size)
    val data2 = setOf<String>("Harsh", "Meet", "Singh", "Harsh")
    println(data2)
    println(data2.size)
    val data3 = mutableSetOf("Harsh", "Meet", "Singh", "Harsh", 1029, 'M')
    println(data3)
    println("<============= Adding teh data to the set ===========> ")
    //set_name.add(<value>)
    data3.add('M')
    println(data3)
    data3.add('J')
    println(data3)
    println("<============= Removing the data to the set ===========> ")
    //set_name.remove(<value>)
    data3.remove('J')
    println(data3)
}