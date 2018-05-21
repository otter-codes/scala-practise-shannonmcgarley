object RomanNum extends App {

    def romanNumeral(romanNumber : String) : Int = romanNumber match {
        case "I" => 1
        case "X" => 10
        case "C" => 100
        case "M" => 1000
        case "V" => 5
        case "VII" => 7
        case "L" => 50
        case "D" => 500
    }
}
