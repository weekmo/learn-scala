import java.sql.Struct
object Basics extends App{
    class Animal {
        val age: Int = 0
        def eat() = println("I'm eating")
    }

    val anAnimal = new Animal

    class Dog(val name: String) extends  Animal
    val aDog = new Dog("Lissie")

    println(aDog.name)

    abstract class WalkingAnimal {
        val hasLegs = true
        def Walk(): Unit
    }

    trait Carnivore {
        def eat(animal: Animal): Unit
    }

    class Crocodile extends WalkingAnimal with Carnivore {
        override def Walk(): Unit = print("I am walking")
        
        override def eat(animal: Animal): Unit = print("I am eating")
        
    }

    object MySinglton {
        val mySpacialVal = 2847284
        def mySpacialMethod(): Int = 3294234
        def apply(x: Int): Int = x + 1
    }

    println(MySinglton.mySpacialMethod())
    println(MySinglton.apply(39))
    println(MySinglton(39))

    case class Person(name: String, age: Int)
    val bob = Person("Bob", 54)
    println(bob.name)

    try {
        val x: String = null
        x.length
    } catch {
        case e: Exception => "Some error message"
    } finally {
        // 
    }
    
    def factorial(n:BigInt): BigInt = {
        if (n == 0 || n ==1 ) 1
        else n * factorial(n - 1)
    }
    //println(factorial(1000))

    println("\n----------------\n")
    import scala.annotation.tailrec
    def factorialAcc(n :Int) = {
        @tailrec
        def fact(x:BigInt, acc: BigInt): BigInt = {
            if (x == 0 || x ==1 ) acc
            else fact(x - 1, acc * x)
        }

        fact(n,1)
    }
    
    //println(factorialAcc(9999))

    def decide[T](b:Boolean, x:T, y:T): T = if (b) x else y

    println(decide(x = 30.9, y = 'c', b = true))
}