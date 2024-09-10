case class Account(id: String, val balance: Double) {
  override def toString: String = s"** Account No.: $id ,Balance: Rs.$balance"
}

def negativeBalance(acc: List[Account]): List[Account] = {
  acc.filter(_.balance < 0)
}

def subOfAllAcc(acc: List[Account]): Double = {
  acc.map(_.balance).sum
}

def applyInterest(acc: List[Account]): List[Account] = {
  acc.map(account => {
    val interest: Double = if (account.balance > 0) 0.5 else 0.1

    val balAfterInterest = account.balance + account.balance * interest
    account.copy(balance = balAfterInterest)
  })
}

object Q4 extends App {
  val accounts = List(
    Account("101", 1000),
    Account("102", 0),
    Account("103", -250),
    Account("104", -800),
    Account("105", 750)
  )

  val negBalanceAcc = negativeBalance((accounts))
  println("- List of Accounts with negative balances")
  negBalanceAcc.foreach(println)

  println("");

  val totoalBalance = subOfAllAcc(accounts)
  println(s"- Sum of all account balances: $totoalBalance")

  val finalBalance = applyInterest(accounts)
  println("\n- Balances of all accounts after applying the interest:")
  finalBalance.foreach(println)
}
