object Currying extends App {
    val g = (x:Int) => (y:Int) => x + y
    val f = (x:Int, y:Int) => x + y
    val fc = f.curried //fc and are the same function
    val f2 = Function.uncurried(fc) // f2 and f are the same function
    println(g(4)(3))
    println(f(4, 3))
    println(fc(4)(3))
    println(f2(4, 3))

    // Curried Parameters
    def foo(x:Int, y:Int, z:Int) = x + y + z
    def bar(x:Int) (y:Int) (z:Int) = x + y + z
    def baz(x:Int, y:Int) (z:Int) = x + y + z

    val fn1 = foo(5, _:Int, _:Int)
    println(fn1(2,3))

    val fn2 = bar(5) _
    println(fn2(2)(3))
} 