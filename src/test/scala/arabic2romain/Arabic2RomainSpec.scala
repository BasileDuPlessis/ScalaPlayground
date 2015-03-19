import arabic2romain._
import org.specs2.mutable._

class Arabic2RomainSpec extends Specification {
    
    "Arabic2romain.translate" should {
        "return I for 1" in {
            Arabic2Romain.translate(1) mustEqual "I"
        }
        "return II for 2" in {
            Arabic2Romain.translate(2) mustEqual "II"
        }
        "return IV for 4" in {
            Arabic2Romain.translate(4) mustEqual "IV"
        }
        "return V for 5" in {
            Arabic2Romain.translate(5) mustEqual "V"
        }
        "return VI for 6" in {
            Arabic2Romain.translate(6) mustEqual "VI"
        }
        "return IX for 9" in {
            Arabic2Romain.translate(9) mustEqual "IX"
        }
        "return X for 10" in {
            Arabic2Romain.translate(10) mustEqual "X"
        }
        "return XIII for 13" in {
            Arabic2Romain.translate(13) mustEqual "XIII"
        }
        "return XIV for 14" in {
            Arabic2Romain.translate(14) mustEqual "XIV"
        }
        "return XLV for 45" in {
            Arabic2Romain.translate(45) mustEqual "XLV"
        }
        "return L for 50" in {
            Arabic2Romain.translate(50) mustEqual "L"
        }
        "return ICIX for 99" in {
            Arabic2Romain.translate(99) mustEqual "XCIX"
        }
    }
    
}