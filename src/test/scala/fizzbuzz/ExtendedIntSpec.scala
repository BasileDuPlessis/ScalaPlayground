import fizzbuzz._
import org.specs2.mutable._

class ExtendedIntSpec extends Specification {
    
    implicit def int2ExtendedInt(n:Int):ExtendedInt = new ExtendedInt(n)
    
    "6 ExtendedInt#isDividedBy 3" should {
        "return MultipleOf(3)" in {
            6 isMultipleOf 3 mustEqual Seq(3)
        }
    }
    
    "6 ExtendedInt#isDividedBy 3 and 5" should {
        "return MultipleOf(3)" in {
            6 isMultipleOf(3,5) mustEqual Seq(3)
        }
    }
    
    "15 ExtendedInt#isDividedBy 3 and 5" should {
        "return MultipleOf(3,5)" in {
            15 isMultipleOf(3,5) mustEqual Seq(3,5)
        }
    }
    
    "14 ExtendedInt#isDividedBy 3 and 5" should {
        "return MultipleOf(3,5)" in {
            14 isMultipleOf(3,5) mustEqual Seq()
        }
    }
}