def filterEvenNumbers(intList: List[Int]): List[Int] ={
    intList.filter((i) => i % 2 == 0)
}

@main def Q1(): Unit ={
    val intList: List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val evenList = filterEvenNumbers(intList)
    println(s"\nInput List: $intList")
    println(s"Output List: $evenList")
    // evenList.foreach(println)
    
}