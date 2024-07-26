object Q5{

    // Calcualte time taken at easy pace
    def easyPaceTime(s: Double): Double = s / 8.0

    // Calculate time taken at tempo pace
    def tempoTime(s: Double): Double = s / 7.0

    // Calculate total running time
    def runningTime(easyDist: Double, tempoDist: Double): Double = 
        easyPaceTime(easyDist) + tempoTime(tempoDist)

    def main(args: Array[String]): Unit = {
        println("Total running time = " + runningTime(easyDist = 4, tempoDist = 3) + " min")
    }
}
