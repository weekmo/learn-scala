// The object and class can access eachothers private items
// They should have the same name
// They must be in the same file
class SecretAgent(val name:String){
    def shoot(n:Int) = {
        import SecretAgent._
        decr(n)
    }
}

object SecretAgent {
    private var b:Int = 3000

    private def decr(count:Int) = {
        if (b - count <= 0) b = 0
        else b -= count
    }

    def bullets = b
}

object SecretAgentRunner extends App {
    val bond = new SecretAgent("Bond")
    val felix = new SecretAgent("Felix")
    bond.shoot(500)
    felix.shoot(1500)

    println(SecretAgent.bullets)
}