import scala.io.StdIn._

def Fibonacci(n: Int): Int = n match {
    case x if(x==0) => 0
    case x if(x==1) => 1
    case x => Fibonacci(n-1) + Fibonacci(n-2)
}

@main def Q3(): Unit ={
    val n = readLine("Enter n: ").toInt
    for(i <- 0 to n)
    println(Fibonacci(i))
}