import scala.io.StdIn.readInt

def avg(num1: Int, num2: Int): Float = {
    "%.2f".format((num1+num2) / 2.0).toFloat
}

@main def main(): Unit ={
    print("Enter num1: ")
    val num1 = readInt()

    print("Enter num2: ")
    val num2 = readInt()
    println(s"Arithmetic mean (average) $num1 and $num2 = ${avg(num1, num2)}")
}