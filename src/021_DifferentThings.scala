object DifferentThings extends App {
    // Partition a collection to two depending on a condition
    val pl = (1 to 10).partition(x => x % 2 == 0)
    println(pl)

    // GroupBy
    val b = List("Red", "Orange", "Green", "Grey", "Purple", "Pink").groupBy(x => x.head)
    println(b)
    
    // Take
    println((1 to 100).take(10))
    println((1 to 100).takeRight(10))

    println((1 to 100).takeWhile(x => x < 10))

    // Fill
    val a = List.fill(10)(0)
    println(a)

    val c = List.fill(10){
        30 + 5
    }
    println(c)
}