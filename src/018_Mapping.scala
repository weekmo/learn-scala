object Mapping extends App {
    val a = 1 to 10
    val f = (x:Int) => x + 1

    println(a.map(f))
    println(a.map(x => x + 1))
    println(a.map(_ + 1))

    import scala.language.postfixOps
    println(a.map(1+))

    // Using Set
    val b = Set("Hello", "World", "Country")
    println(b.map(_.size))
    println(b.map(x => (x,x.size)))

    // With char
    println("Hello".map(c => c + 1))
    println("Hello World".map(c => (c + 1).toChar))
    println("Ifmmp!Xpsme".map(c => (c - 1).toChar))

    // Try None
    val age:Option[Int] = None
    println(age.map(1+))

    // Filtering
    println(a.filter(_ % 2 == 0))
    println(a.filterNot(_ % 2 == 0))
    println(a.exists(_ % 2 == 0))

    val m = Map(1 -> "Red", 2 -> "Blue", 3 -> "Green", 4 -> "Purple", 5 -> "Four")
    println(m.filterKeys(_ % 2 == 0).toMap)

    // ForEach
    a.foreach(x => print(x))
    print("\n")
    a.foreach(print(_))
    print("\n")
    a foreach print
    print("\n")

    // Flatten collections
    println(a.map(x => List(-x, x)))
    println(a.map(x => List(-x, x)).flatten)
    println(a.flatMap(x => List(-x, x)))

    // For Comprehensions
    val result1 = for (i <- 1 to 3; j <- 11 to 13) yield (i, j)
    println(result1)

    val result2 = for (i <- 1 to 4 if i % 2 == 0; j <- 11 to 14) yield (i, j)
    println(result2)

    val allPairs = for {
        number <- List(1,2,3)
        letter <- List('a', 'b', 'c')
    } yield s"$number - $letter"
    println(allPairs)
}
