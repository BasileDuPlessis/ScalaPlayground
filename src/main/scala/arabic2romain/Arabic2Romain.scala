package arabic2romain

object Arabic2Romain {
    
    val romanArabic = Vector("I", "V", "X", "L", "C")
    
    def translate(n: Int):String = n.toString.reverse.zipWithIndex.map(t => (t._1, t._2 * 2)).map{ t => t._1.asDigit match {
            case 4 => romanArabic(t._2) + romanArabic(t._2 + 1)
            case 5 => romanArabic(t._2 + 1)
            case 9 => romanArabic(t._2) + romanArabic(t._2 + 2)
            case 10 => romanArabic(t._2 + 2)
            case i:Int if i>=5 => romanArabic(t._2 + 1) + romanArabic(t._2) * (i-5)
            case i:Int if i<5 => romanArabic(t._2) * i
        }
    }.reverse.mkString
    
}