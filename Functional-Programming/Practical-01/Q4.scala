object Q4{
    // Calculate the discount amount
    def discount (amount: Double): Double = 0.4 * amount

    // Calculate the total price of books before discount
    def bookPrice (n: Int): Double = n * 24.95

    // Calculate total cost of books after discount
    def bookCost (n: Int): Double = bookPrice(n) - discount(bookPrice(n))

    // Calculate the shipping cost
    def shipCost (n: Int): Double = {
        if (n <= 50)
            3 * n
        else
            3 * 50 + (n-50) * 0.75}
    
    // Calculate the total cost
    def totalCost (n: Int) = shipCost(n) + bookCost(n)

    def main(args: Array[String]): Unit = {
        println("Total wholesale cost for 60 copies = Rs." + totalCost(60)) 

    }
}