object ArraysAndRanges extends App {
    // Arrays
    val a = Array(1,2,3,4,5)
    //a.foreach(i => print(i))

    def repeatedParamsMethod(x:Int, y:String, z:Any*) = {
        println(z)
        "%d %ss give you %s".format(x, y, z.mkString(", "))
    }

    println(repeatedParamsMethod(3, "egg", "a delicious sandwich", "protein", "high cholestrol"))

    // Ranges
    

}