import bowling._
import org.specs2.mutable._

class BowlingSpec extends Specification {
    
    "Bowling.computeSum" should {
        "Handle Spare and Strike" in {
            Bowling.computeSum(Seq(10,0,3,0,10,2,5,10,8,1,3,4,8,2,10,10,5,3)) mustEqual 133
        }
    }
    
    "Bowling.computeSum" should {
        "Handle 12 strikes" in { 
            Bowling.computeSum(Seq(10,10,10,10,10,10,10,10,10,10,10,10)) mustEqual 300
        }
    }
    
}
    