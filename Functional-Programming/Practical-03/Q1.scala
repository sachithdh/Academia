import scala.io.StdIn.readLine

def reverseStr(str: String): Unit = {
    if(str.length > 0){
        reverseStr(str.slice(1, str.length))
        print(str(0))
    }
}

@main def main(): Unit = {
    val str = readLine("Enter string: ")
    print("Reversed string: ")
    reverseStr(str)
}