object Q3{

    // Calculate payment for normal working hour
    def normalPay(t: Int) = 250 * t

    // Calculate payment for OT working hour
    def otPay(t: Int) = 85 * t

    // Calculate Total payment
    def totalPay(normalHrs: Int, otHrs: Int) = normalPay(normalHrs) + otPay(otHrs)

    // Calculate the tax
    def tax(normalHrs: Int, otHrs: Int) = totalPay(normalHrs, otHrs) * 0.12

    // Calculate take home salary
    def takeHomeSalary(normalHrs: Int, otHrs: Int) = totalPay(normalHrs, otHrs) - tax(normalHrs, otHrs)

    def main(args: Array[String]): Unit ={
        println("Take home salary = " + takeHomeSalary(40, 30))

    }
}