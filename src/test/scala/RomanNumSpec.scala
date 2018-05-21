import org.scalatest._

class RomanNumSpec extends WordSpec with MustMatchers {

  "Hello" must {

    "Return 1 when given I" in {
      RomanNum.romanNumeral("I") mustEqual 1
    }
    "Return 10 when given X" in {
      RomanNum.romanNumeral("X") mustEqual 10
    }
    "Return 100 when given C" in {
      RomanNum.romanNumeral("C") mustEqual 100
    }
    "Return 1000 when given M" in{
      RomanNum.romanNumeral("M") mustEqual 1000
    }

  }

}
