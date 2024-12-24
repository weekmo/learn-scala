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
}