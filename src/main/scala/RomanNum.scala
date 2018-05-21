object RomanNum extends App {

    def romanNumeral(romanNumber : String) : Int = romanNumber match {
        case "I" => 1
        case "X" => 10
        case "C" => 100
        case "M" => 1000
    }
}
