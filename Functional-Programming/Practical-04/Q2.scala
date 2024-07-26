import scala.io.StdIn._

// Check if the input is Even
def isEven(n: Int): Boolean = n match{
    case 0 => true
    case _ => isOdd(n-1) 
}

// Check if the input is Odd
def isOdd(n: Int): Boolean = !isEven(n)


// Match the pattern
def patternMatching(n: Int): String = n match {
    case x if(x <= 0) => "Negative/Zero is given"
    case x if(isEven(x)) => "Even number is given"
    case x if(isOdd(x)) => "Odd number is given"
}

@main def Q2(): Unit = {
    var num: Int = readLine("Enter number: ").toInt
    println(patternMatching(num))

}