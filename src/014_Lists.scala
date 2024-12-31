object Lists extends App {
    val a = List(1,2,3,4,5)

    println(a.head)
    println(a.tail)
    println(a.init)
    println(a.last)

    println("---------------")
    // These will return a copy of the list
    println(a(3))
    println(a.min)
    println(a.max)
    println(a.isEmpty)
    println(a.nonEmpty)
    println(a.updated(3, 100))

    // Separate a list with char as a String
    println(a.mkString(" | "))

    // Append and Extend a List
    val aList = List(1,2,3,4)

    val aPrependedList = 0 :: aList
    println(aPrependedList)

    val anExtenedList = 0 +: aList :+ 6
    println(anExtenedList)
}