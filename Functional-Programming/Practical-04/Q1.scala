import scala.io.StdIn._

// Display current Stock
def displayInventory(names: Array[String], quantities: Array[Int]): Unit = {
    // Headers
    println("\nCurrent Stock")
    printf("\n%-10s %16s\n\n", "Name", "Quantity")

    for(i <- 0 to (names.length -1)){
        printf("%-10s %12d\n", names(i), quantities(i))
    }
}

def restockItem(names: Array[String], quantities: Array[Int]): Unit = {

    var name = readLine("Enter item name: ")

    if (names.contains(name)){
        var quantity = readLine("Enter restock quantity: ").toInt
        var index = names.indexOf(name)

        quantities(index) += quantity
        
        println(s"\n$quantity ${name}(s) added to the stock")

    } else {
        println("\nItem does not exist!")
    }
}

def sellItem(names: Array[String], quantities: Array[Int]): Unit = {

    var name = readLine("Enter item name to sell: ")

    if (names.contains(name)){
        var quantity = readLine("Enter no. of items: ").toInt
        var index = names.indexOf(name)

        if (quantities(index) >= quantity){
            quantities(index) -= quantity

            println(s"\n$quantity ${name}(s) sold successfully!")

        } else {
            println(s"Sorry! There is not enough ${name}(s) to sell.")
        }
    } else {
        println("\nItem does not exist!")
    }

}
@main def Q1(): Unit = {
    var names = Array("Apple", "Orange", "Mango", "Woodapple")
    var quantities = Array(10, 5, 8, 4)

    while (true){
        // Headers
        println("__________________________________________________________")
        println("\n1. Check Stock")
        println("2. Restock")
        println("3. Sell item")
        println("0. Exit")

        print("Enter Your choice: ")
        var choice: Int = readLine().toInt

        if (choice == 1){
            displayInventory(names, quantities)
        } else if (choice == 2){
            restockItem(names, quantities)
        } else if (choice == 3){
            sellItem(names, quantities)
        } else if(choice == 0){
            return
        }else {
            println("Invalid choice. Please try again.")
        }
    }

}