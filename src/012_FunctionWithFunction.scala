object FunctionWithFunction extends App {
    val f = (x:Int, y:Int => Int) => y(x)

    println(f(3, (m:Int) => m + 1))
    println(f(3, m => m + 1))
    println(f(3, _ + 1))

    // Retuning a function
    val g = (x:Int) => (y:Int) => x + y
    println(g(4)(3))
}