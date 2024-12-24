object Functions extends App {
    val f1:Function1[Int, Int] = new Function1[Int, Int]{
        def apply(v1: Int): Int = v1 + 1
    }
    println(f1(3))

    val f0:() => Int = () => 8
    println(f0())

    val fn1:Int => Int = (x:Int) => x + 2
    println(fn1(4))

    val fn0 = () => 4
    println(fn0())

    val fn2 = (x:String) => (x, x.size)
    println(fn2("Hello world"))
    
}