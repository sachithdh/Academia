object Q2{

    // Convert celsius to farenheit
    def toFahrenheit (c: Double): Double = c * 1.8 + 32

    def main(args: Array[String]): Unit = {
        println("35ºC is equal to " + toFahrenheit(35) + "ºF")
    }
}