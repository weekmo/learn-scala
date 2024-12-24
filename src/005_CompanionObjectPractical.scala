import java.time.LocalDate

class Employee protected  (val firstName:String, val lastName:String, val title:String, val hireDate: LocalDate)

object Employee {
    def apply(firstName:String, lastName:String, title:String) = 
        new Employee(firstName = firstName, lastName = lastName, title = title, hireDate = LocalDate.now)
    
    def apply(firstName:String, lastName:String, title:String, hireDate: LocalDate) = 
        new Employee(firstName = firstName, lastName = lastName, title = title, hireDate = hireDate)
}

case class Department(name:String)
// In this case the case class has apply method by defailt implemented
object Runner extends App{
    val employee = Employee("Mohammed", "Ali", "Programmer")
    println(employee.hireDate)

    val dep1 = Department.apply("Eng")
    val dep2 = Department("Eng")
    println(dep1.name)
    println(dep2.name)

    val h = Some("Antony")
}