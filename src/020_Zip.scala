object Zip extends App {
    val a = 1 to 4
    val b = 5 to 8
    println(a.zip(b))

    // Left side is shorter
    println((1 to 5) zip (6 to 8))

    // Right side is shorter
    println((1 to 2) zip (6 to 9))
}