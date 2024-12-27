// Closures are just functions that close around the environment
class Foo1(x:Int){
    def bar(y:Int => Int) = y(x)
}

object Closures extends App {
    val m = 200
    val f = (x:Int) => x + m
    val foo = new Foo1(100)
    println(foo.bar(f))
}