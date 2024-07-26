import scala.io.StdIn

object Q4{

    // Calculate the number of attendees
    def attendance(price: Int): Int = 120 + (15 - price) / 5 * 20

    // Calculate the cost
    def cost(price: Int): Int = 500 + attendance(price) * 3

    // Calculate the income
    def income(price: Int): Int = attendance(price) * price

    // Calculate the profit
    def profit(price: Int): Int = income(price) - cost(price)

    def main(args: Array[String]): Unit = {
        printf("Enter the ticket price: ")
        var price: Int = StdIn.readInt()

        println("Profit = " + profit(price))
    }
}