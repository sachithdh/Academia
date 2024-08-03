def calculateSquare(intList: List[Int]): List[Int] ={
    intList.map((i) => i * i)
}

@main def Q1(): Unit ={
    val intList: List[Int] = List(1, 2, 3, 4, 5)
    val squareList = calculateSquare(intList)
    println(s"Input List: $intList")
    println(s"Output List: $squareList")
    // squareList.foreach(println)
    
}