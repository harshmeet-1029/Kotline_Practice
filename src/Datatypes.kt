fun main() {
    /*
    * Datatypes are used to define which type of data it is
    * Types of Datatypes
    * 1. Int -> stores -2147483648 to 2147483647
    * 1.1 Bytes -> Bytes store  -128 to 127
    * 1.2 Short -> Short store  -32768 to 32767
    * 1.3 long -> Long stores -9223372036854775808 to 9223372036854775807
    * 2. Floating point type
    * 2.1 Float
    * 2.2 Double
    * 3. Char -> it sore the single Char
    * 4. Boolean -> true or false
    * 5. String -> it store the string we use  " "
    * */

    // Number types we have
    // Int, Bytes,Short,long
    /*
    * 1. Int -> stores -2147483648 to 2147483647
    * 2 Bytes -> Bytes store  -128 to 127
    * 3 Short -> Short store  -32768 to 32767
    * 4 long -> Long stores -9223372036854775808 to 9223372036854775807
    * */
    val d_int: Int = 23
    val max_int: Int = Int.MAX_VALUE
    val min_int: Int = Int.MIN_VALUE
    val d_bytes: Byte = 127
    val max_byters: Byte = Byte.MAX_VALUE
    val min_byte: Byte = Byte.MIN_VALUE
    val short: Short = 23
    val max_short: Short = Short.MAX_VALUE
    val min_short: Short = Short.MIN_VALUE
    val d_long: Long = 23
    val max_long: Long = Long.MAX_VALUE
    val min_long: Long = Long.MIN_VALUE
    println("\n<=============== Int =====================>\n")
    println("Int: $d_int intMax $max_int , Int min $min_int\nByte: $d_bytes,Max Byte: $max_byters,Min Byte: $min_byte \nShort: $short MaxShort: $max_short,minShort: $min_short \nLong:$d_long MaxLong: $max_long MinLong: $min_long") // ✅ Correct way using string interpolation
    println("\n<=============== Float =====================>\n")
    /*
    *2. Floating point type
    * 2.1 Float
    * 2.2 Double
    * */
    val float: Float = 23.2F
    val float_max: Float = Float.MAX_VALUE
    val float_min: Float = Float.MIN_VALUE
    val double: Double = 2.3
    val double_max: Double = Double.MAX_VALUE
    val double_min: Double = Double.MIN_VALUE
    println("Float:$float,Float Max: $float_max,Float Min: $float_min\nDouble:$double,Double Max: $double_max,Double min:$double_min")
    println("\n<=============== Char and boolean =====================>\n")
    /*
    * 3. Char -> it sore the single Char we use  ' '
    * 4. Boolean -> true or false
    * */

    val c: Char = 'H'
    val c_max = Char.MAX_VALUE
    val c_min = Char.MIN_VALUE
    println("Char $c Char_max: $c_max char_min $c_min")
    val b: Boolean = true
    println("Boolean: $b")


}