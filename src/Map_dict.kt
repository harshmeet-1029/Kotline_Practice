fun main() {
    /*
    * Map or dictionary -> it is used to store the collection od data in {key:value} pair
    * 1. Dict are ordered
    * 2. Dict can have duplicate value but not key
    * 3. it is homogenous and heterogeneous
    *
    * // How to create the map or dict
    * mapOf(key to value,key2 to value2,key3 to value3,...,keyN to valueN)
    * */

    val data = mapOf(1 to "Harshmeet", "2" to "Singh", "Age" to 23)
    println(data)
    println("<=========== Accessing the value of the dict ================>")
    // dict_name[key]
    println(data[1])
    println(data["2"])
    println(data["Age"])
    // Using get
    println(data.get("2"))

    println("<---- How to access all keys && values ----->")
    println(data.keys)
    println(data.values)

    println("<=========== Accessing all the values of the dict ================>")
    for (item in data.keys) {
        print("${data[item]} - ")
    }
    println()
    for (item in data.values) {
        print("${item} - ")
    }
    println("size -> ${data.size}")
    println("<=========== Defining the data ================>")
    val data2 = mapOf<Int, String>(1 to "Harshmeet", 2 to "Singh", 3 to "23")
    println(data2)
    println("<=========== Creating Mutable mapof ================>")
    val data3 = mutableMapOf(1 to "Harshmeet", "2" to "Singh", "Age" to 23)
    println(data3)
    println("<---- Updating the value of map ----->")
    data3["Age"] = 24
    data3.put("Age", 25) // using .put method .put(<key>,value>)
    println(data3)
    println("<---- Adding the value into map ----->")
    data3["Roll"] = 1029
    println(data3)
    println("<---- Removing the value into map ----->")
    // dict_name.remove(key)
    data3.remove("Age")
    println(data3)
    data3.keys.remove("Roll")
    println(data3)

}