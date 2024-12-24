import scala.beans.BeanProperty

object OOP extends App{
class Employee(@BeanProperty val firstName: String, @BeanProperty var lastName: String, title: String) extends Person{
    def this(firstName: String, lastName: String) = this(firstName, lastName, "Programmer")
}

case class Department(name: String)

val toys = Department("Toys")
println(toys)

val hardware = toys.copy(name = "Hardware")
println(hardware)

// Extract name

val name = toys match {
    case Department(name) => name
    case null => "unknown"
}

println(name)

val Department(name2) = toys

println(name2)


abstract class Person {
    def firstName:String
    def lastName:String
}

case class Box[T](t:T)

case class Couplep[A, B](first:A, second:B)

case class BoxBox[T](test:T, test2:T)
val hsj = BoxBox(1,"hi")
println(hsj.test)
println(hsj.test2)
}