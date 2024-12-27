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
    val r1 = 1 to 10 //Include 10
    println(r1.mkString(", "))

    val r2 = 1 until 10 //Exclude 10
    println(r2.mkString(", "))

    val r3 = 10 to 1 by -2
    println(r3.mkString(", "))

    val r4 = ('a' to 'z') ++ ('A' to 'Z') //This will create a Vector as a new scala version
    println(r4)

    val r5 = 'A' to 'z' //Will include some other chars
    println(r5.mkString(", "))

    val r6 = Range(1,10) //Same as `until`
    println(r6.mkString(", "))

    val r7 = Range.inclusive(1,10,2) //Same as `to`
    println(r7.mkString(", "))

    //Using them in for
    for (i <- 1 to 10) print(i)
    for (i <- 1 to 10 by 2) print(i)
}