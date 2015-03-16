package romain

import scala.collection.immutable.SortedMap

object Romain {
    
    val romainSymbol = Vector("I", "V", "X", "L", "C", "D", "M")

    def fromArabic(n: Int):String = n.toString.reverse.zipWithIndex.map{ t => 
        t._1.asDigit match {
            case i:Int if i<4 => romainSymbol(t._2 * 2) * i
            case i:Int if i==4 => romainSymbol(t._2 * 2) + romainSymbol(t._2 * 2 + 1)
            case i:Int if i<9 => romainSymbol(t._2 * 2 + 1) + romainSymbol(t._2 * 2) * (i-5)
            case i:Int if i==9 => romainSymbol(t._2 * 2) + romainSymbol(t._2 * 2 + 2)
        }
    }.reverse.mkString
    
}