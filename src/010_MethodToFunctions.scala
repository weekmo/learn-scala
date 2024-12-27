import java.awt.MenuBar
class Foo(x:Int) {
    def bar (y:Int) = x + y
    def gym(z:Int, a:Int) = x + z + a
}

class Baz(z:Int) {
    def qux(f:Int => Int) = f(z)
    def jam(f:(Int, Int) => Int) = f(z, 10)
}

object MethodToFunctions extends App{
    val x = new Foo(10)
    val f = x.bar _

    val baz = new Baz(20)

    println(baz.qux(f))
    println(baz.qux(x.bar))

    val f2 = x.gym(20, _)
    println(baz.qux(f2))

    val f3 = x.gym _

    println(baz.jam(f3))
    println(baz.jam(x.gym))

}