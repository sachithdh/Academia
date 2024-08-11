import scala.io.StdIn._

@main def Q2(): Unit ={
    val isMultipleOfThree: Int => Boolean = x => x % 3 == 0
    val isMultipleOfFive: Int => Boolean = x => x % 5 == 0

    print("Enter an Integer: ")
    val n = readInt()

    val res = n match {
        case n if(isMultipleOfThree(n) && isMultipleOfFive(n)) => "Multiple of Both Three and Five"
        case n  if(isMultipleOfFive(n)) => "Multiple of  Five"
        case n if(isMultipleOfThree(n)) => "Multiple of Three"
        case _ => "Not a Multiple of Three or Five"
    }

    println(res)
}