// Tuples go all the way to `Tuple22`
// `Tuple2` has a `swap` function
// Tuples are immutable

object Tuples extends App {
    val t = (1, "Cool", 402.06)
    println(t._1)
    println(t._2)
    println(t._3)

    val t1:(Int, String, Double) = t
    val t2:Tuple3[Int, String, Double] = t

    val t3 = (1,2)
    println(t3)
    println(t3.swap)
}