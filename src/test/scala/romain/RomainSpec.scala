import romain._
import org.specs2.mutable._

class RomainSpec extends Specification {

    "Romain.fromArabic" >> {
        "Return I for 1" >> {
            Romain.fromArabic(1) mustEqual "I"
        }
        "Return II for 2" >> {
            Romain.fromArabic(2) mustEqual "II"
        }
        "Return IV for 4" >> {
            Romain.fromArabic(4) mustEqual "IV"
        }
        "Return V for 5" >> {
            Romain.fromArabic(5) mustEqual "V"
        }
        "Return VII for 7" >> {
            Romain.fromArabic(7) mustEqual "VII"
        }
        "Return XVII for 17" >> {
            Romain.fromArabic(17) mustEqual "XVII"
        }
        "Return IX for 9" >> {
            Romain.fromArabic(9) mustEqual "IX"
        }
        "Return XLVII for 47" >> {
            Romain.fromArabic(47) mustEqual "XLVII"
        }
        "Return XCIX for 99" >> {
            Romain.fromArabic(99) mustEqual "XCIX"
        }
        "Return MCDXCVII for 1497" >> {
            Romain.fromArabic(1497) mustEqual "MCDXCVII"
        }
        "Return MMMCMXCIX for 3999" >> {
            Romain.fromArabic(3999) mustEqual "MMMCMXCIX"
        }
        "Return Exception for 4000" >> {
            Romain.fromArabic(4000) must throwA[IllegalArgumentException]
        }
    }
    
}