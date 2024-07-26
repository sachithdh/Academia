object Q3{
    val PI = 3.14

    // Calculate the volume of a sphere
    def volumeOfSphere (r: Double): Double = (4.0/3.0) * PI * r * r * r

    def main(args: Array[String]): Unit = {
        println("Volume of a sphere with radius 5 = " + volumeOfSphere(5))
    }
}