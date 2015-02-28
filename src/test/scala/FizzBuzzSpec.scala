import org.specs2.mutable._


import scala.io._

class FizzBuzzSpec extends Specification {
    
    "FizzBuzz#count" should {
        "Replace a multiple of 3 by 'Fizz', a multiple of 5 by 'Buzz' and a multiple of 3 and 5 by 'FizzBuzz' " in {
            FizzBuzz count(1,15) mustEqual Seq("1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz")
        }
    }
    
}