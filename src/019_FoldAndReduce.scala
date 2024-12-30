object FoldAndReduce extends App {
    val result1 = (1 to 10).foldLeft(0)((total:Int, next:Int) => total + next)
    println(result1)

    // Clear what happen
    val result2 = (1 to 10).foldLeft(0){(total:Int, next:Int) =>
        println(s"Total: $total, Next: $next")
        total + next
    }
    println(result2)

    val result3 = (1 to 10).reduceLeft{(total:Int, next:Int) =>
        println(s"Total: $total, Next: $next")
        total + next
    }
    println(result3)

    val result4 = (1 to 10).foldRight(0){(next:Int, total:Int) =>
        println(s"Total: $total, Next: $next")
        total + next
    }
    println(result4)

    val result5 = (1 to 10).reduceRight{(next:Int, total:Int) =>
        println(s"Total: $total, Next: $next")
        total + next
    }
    println(result5)
}