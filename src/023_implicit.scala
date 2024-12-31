object impli extends App {
    // Allow using items without explicitly calling them
    // Implicit arguments
    def aMethodWithImplicitArgs(implicit arg: Int) = arg + 1
    implicit val myImplicitInt:Int = 46
    println(aMethodWithImplicitArgs)

    // Implicit conversion
    implicit class MyRichInteger(n: Int) {
        def isEven() = n % 2 == 0
    }

    println(31.isEven())
}