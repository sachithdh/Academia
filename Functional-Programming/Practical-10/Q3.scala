class Account(var balance: Double) {
  def deposit(amount: Double): Unit = {
    balance += amount
    println(s"Successfully deposit Rs.$amount")
    println(s"New Balance Rs.$balance")

  }

  def withdraw(amount: Double): Unit = {
    if (amount >= balance) println("Insufficient balance")
    else {
      balance -= amount
      println(s"Successfully withdraw Rs.$amount")
      println(s"New Balance Rs.$balance")
    }
  }

  def transfer(amount: Int, receiver: Account): Unit = {
    if (balance >= amount) {
      println(s"Successfully transfer Rs.$amount")
      withdraw((amount))
      receiver.deposit(amount)
      println(s"New Balance Rs.$balance")

    }
  }

  def getBalance: Double = balance
}

object Q3 extends App {
  val account1 = new Account(500)
  val account2 = new Account(250)

  println(s"Account1 Balance: ${account1.getBalance}")
  println(s"Account2 Balance: ${account2.getBalance}")

  account1.withdraw(200)
  account2.withdraw(400)

  account2.deposit(500)

  account1.transfer(100, account2)
}
