package fizzbuzz

object FizzBuzz {
    
    implicit def int2ExtendedInt(n:Int):ExtendedInt = new ExtendedInt(n)
    
    def main(args: Array[String]):Unit = args match {
        case Array(start, end) => count(start.toInt, end.toInt) foreach println
        case _ => println("Wrong arguments")
    }
    
    def count(start:Int, end:Int):Seq[String] = (start to end) map {
        n => n isMultipleOf(3, 5) match {
            case Seq(3) => "Fizz"
            case Seq(5) => "Buzz"
            case Seq(3, 5) => "FizzBuzz"
            case _ => n.toString
        }
    }

    
}

