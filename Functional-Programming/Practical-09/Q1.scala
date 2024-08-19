@main def Q1(): Unit ={
    val interest: (Int) => Double = (deposit: Int) => {
        deposit match 
            case x if (x <= 20000) => x * 0.02
            case x if (x <= 200000) => x * 0.035
            case x if (x <= 2000000) => x * 0.065
            case x => x * 0.065
    }

    println(interest(100000))
}