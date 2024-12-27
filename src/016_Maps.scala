object Maps extends App {
    val m1 = Map((1, "One"), (2, "Two"), (3, "Three"))
    println(m1)

    val t = 3 -> "Three"
    println(t)

    val m2 = Map(1 -> "One", 2 -> "Two", 3 -> "Three")
    println(m2)

    println(m1.get(1))
    println(m1(1))

    println(m1.get(5))
    //println(m1(5))

    println(m1.keys)
    println(m1.keySet)

    println(m1.values)
    println(m1.values.toList)

    val s1 = new  String("Co")
    val s2 = "Co"
    println(s1 == s2)
    println(s1 eq s2)

    // Not suppored anymore
    /*
    val co1 = Symbol("Co")
    val co2 = 'Co
    println(co1 == co2)
    println(co1 eq co2)
    */
}