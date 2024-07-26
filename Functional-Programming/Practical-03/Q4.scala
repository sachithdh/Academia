import scala.io.StdIn.readLine

def sumOfEven(): Int = {
    var x = ""
    var total = 0
    
    while({ x = readLine("Enter an integer(Enter q to stop): "); x != "q"}){
        var y = x.toInt
        if(y%2 == 0){
            total += y
        }
    }
    return total
}

@main def main(): Unit = {
    println(s"Sum of the even values you entered = ${sumOfEven()}")
}