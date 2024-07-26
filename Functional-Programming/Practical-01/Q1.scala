object Q1{

    // Calculate the area of a disk
    def areaOfDisk(r: Double): Double = math.Pi * r * r


    def main(args: Array[String]): Unit = {
        println("Area of a disk with radius 5 = " + areaOfDisk(5))
    }
}
