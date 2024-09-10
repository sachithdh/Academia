def countLetterOccurrences(strList: List[String]): List[Int] = {
  strList.map(str => str.length)
}

def totalCount(strLenList: List[Int]) = strLenList.reduce((a, b) => a + b)

object Q5 extends App {
  val strList = List("apple", "banana", "cherry", "date")
  val letterOccurence = countLetterOccurrences(strList)

  val total = totalCount(letterOccurence)
  println(s"Total count of letter occurrences: $total")
}
