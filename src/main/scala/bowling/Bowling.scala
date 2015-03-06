package bowling

import scala.annotation.tailrec

object Bowling {

    @tailrec def computeSum(l: Seq[Int], sum: Int = 0): Int = {
        l match {
            case Seq(10, a, b) =>  computeSum(Nil, 10 + a + b + sum)
            case Seq(10, b, c, d@_*) => computeSum(Seq(b, c) ++: d, 10 + b + c + sum)
            case Seq(a, b, c) if (a + b == 10) => computeSum(Nil, a + b + c + sum)
            case Seq(a, b, c, d@_*) if (a + b == 10) => computeSum(Seq(c) ++: d, a + b + c + sum)
            case Seq(a, b@_*) => computeSum(b, a + sum)
            case Nil => sum
        }
        
    }
    
}