// Functions are their own object
// Mothods belong to a context (class, object, ... etc)

object MyObject {
    val f = (x:Int) => x + 1 // This is Function, it has apply
    def g(x:Int) = x + 1 // This is Method
}

object MethodOrFunctions extends App {
    println(MyObject.f(3))
    println(MyObject.f.apply(3))
    println(MyObject.g(3))
}