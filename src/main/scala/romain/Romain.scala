package romain

import scala.collection.immutable.SortedMap

object Romain {
    
    val symbol = Vector("I", "V", "X", "L", "C", "D", "M")

    def fromArabic(n: Int): String = {
        require(n<=3999 && n>0)
        fromArabic(n.toString)
    }
    
    private def fromArabic(n: String):String = n.reverse.zipWithIndex.map(t => (t._1.asDigit, t._2*2)).map{t => 
        t._1 match {
            case i:Int if i<4 => symbol(t._2) * i
            case 4 => symbol(t._2) + symbol(t._2 + 1)
            case i:Int if i<9 => symbol(t._2 + 1) + symbol(t._2) * (i-5)
            case 9 => symbol(t._2) + symbol(t._2 + 2)
        }
    }.reverse.mkString
    
}