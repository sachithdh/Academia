import scala.io.StdIn.readLine

def takeStr(): List[String] = {
    var strList = List.empty[String]
    var resultList = List.empty[String]
    var str = ""
    while({str = readLine("Enter a String(Enter q for stop): "); str != "q"}){
        strList = strList :+ str
    }

    for(i <- 0 until strList.length){
        if(strList(i).length >= 5){
            resultList = resultList :+ strList(i)
        }
    }
    return resultList
}

@main def main(): Unit ={
    takeStr().foreach(println)
}