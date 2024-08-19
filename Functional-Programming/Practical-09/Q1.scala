@main def Q1(): Unit ={
    val interest: (Double) => Double = (deposit: Double) => {
        deposit match 
            case x if (x <= 20000) => x * 0.02
            case x if (x <= 200000) => x * 0.035
            case x if (x <= 2000000) => x * 0.065
            case x => x * 0.065
    }

    val deposit: Double = 500000
    println(s"\nDeposit: Rs.$deposit, Interest: Rs.${interest(deposit)}")
}

