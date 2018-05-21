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
    "Return 5 when given V" in {
      RomanNum.romanNumeral("V") mustEqual 5
    }
    "Return 7 when given VII" in {
      RomanNum.romanNumeral("VII") mustEqual 7
    }
    "Return 50 when given L" in {
      RomanNum.romanNumeral("L") mustEqual 50
    }
    "Return 500 when given D" in {
      RomanNum.romanNumeral("D") mustEqual 500
    }

  }

}
