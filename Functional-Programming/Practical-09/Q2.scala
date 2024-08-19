import scala.io.StdIn._

@main def Q2(): Unit ={
    val num: Int = readLine("Enter an integer: ").toInt
    val flag: Int => String = (num: Int) => {
        num match
            case x if(x < 0) => "Negative number"
            case x if(x == 0) => "Zero"
            case x if(x % 2 == 0) => "Even number"
            case x => "Odd number"
    }
    println(flag(num))
}