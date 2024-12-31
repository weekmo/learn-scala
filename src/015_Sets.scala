object Sets extends App {
    val set = Set(1,2,3,4,5,6,6,7)
    println(set)

    val set1 = Set(1,2,8,9)

    println("----- Operations ------")
    println(set1 + 13)
    println(set1 - 13)
    println(set1 - 9)
    

    println("----- Operations ------")
    println(set diff set1)
    println(set1 diff set)

    println(set union set1)

    println(set intersect set1)

    println("----- Operations ------")
    println(set1 ++ set)
    println(set1 ++ List(13,14,15))

    println(set -- set1)
    println(set -- List(1,2,3))
    println(set - 5) // This will remove 5 from set

    println("----- Operations ------")
    // All will do the sam, because apply emplement contains
    println(set(6))
    println(set.contains(6))
    println(set.apply(6))
}