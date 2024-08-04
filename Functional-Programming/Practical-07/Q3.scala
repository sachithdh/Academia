def filterPrime(numbers: List[Int]): List[Int] = {
  def isPrime(n: Int): Boolean = {
    if (n <= 1) false
    else if (n == 2) true
    else !(2 to Math.sqrt(n).toInt).exists(x => n % x == 0)
    // n is prime if there does not exist any number x from 2 to the square root of n that divides n
  }
  
  numbers.filter(n => isPrime(n))
}

@main def Q1(): Unit ={
    val intList: List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val primeList = filterPrime(intList)
    
    println(s"\nInput List: $intList")
    println(s"Output List: $primeList")
    
    
}