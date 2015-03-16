package romain

import scala.collection.immutable.SortedMap

object Romain {
    
    val romainSymbol = Vector("I", "V", "X", "L", "C", "D", "M")

    def fromArabic(n: Int):String = n.toString.reverse.zipWithIndex.map{ t => 
        val k = t._2 * 2
        t._1.asDigit match {
            case i:Int if i<4 => romainSymbol(k) * i
            case i:Int if i==4 => romainSymbol(k) + romainSymbol(k + 1)
            case i:Int if i<9 => romainSymbol(k + 1) + romainSymbol(k) * (i-5)
            case i:Int if i==9 => romainSymbol(k) + romainSymbol(k + 2)
        }
    }.reverse.mkString
    
}