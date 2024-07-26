import scala.io.StdIn._

def Fibonacci(n: Int): Int = n match {
    case x if(x==0) => 0
    case x if(x==1) => 1
    case x => Fibonacci(n-1) + Fibonacci(n-2)
}


def checkLimit(n: Int): Unit = {
    if(n > 30){
        println("Your inout is higher than 30. But here is the up to 30.")
        printFib(11)
    } else {
        printFib(n)
    }
}
@main def Q3(): Unit ={
    val n = readLine("Enter n: ").toInt
 
    checkLimit(n)
}