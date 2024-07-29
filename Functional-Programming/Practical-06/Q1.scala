import scala.collection.mutable.Map
import scala.io.StdIn._

val inventory1 = Map(
  101 -> ("Apple", 10, 15.50),
  102 -> ("Banana", 5, 45.00),
  103 -> ("Mango", 2, 30.00)
)

val inventory2 = Map(
  102 -> ("Banana", 5, 20.00),
  101 -> ("Apple", 8, 25.00),
  105 -> ("Grapes", 4, 10.00)
)

@main def Q1(): Unit = {

  while (true) {
    // Headers
    println("__________________________________________________________")
    println("\n1. Retrieve all product names from inventory1")
    println("2. Calculate the total value of all products in inventory1")
    println("3. Check if inventory1 is empty ")
    println("4. Merge inventory1 and inventory2")
    println("5. Search product")
    println("0. Exit")

    print("Enter Your choice: ")
    var choice: Int = readLine().toInt

    if (choice == 1) {
      println("\nProduct names: ")
      inventory1.foreach { (i, j) => println(j(0)) }

    } else if (choice == 2) {
      var total: Double = 0
      inventory1.foreach { (key, value) =>
        {
          total += value._3
        }
      }
      println(s"\nTotals value = ${total}")

    } else if (choice == 3) {
      val flag = inventory1.isEmpty
      if (flag) {
        println("\nInventory 1 is Empty :(")
      } else {
        println("\nInventory 1 is not empty :)")
      }

    } else if (choice == 4) {
      var mergedInventory = inventory1
      mergedInventory.foreach { (key1, value1) =>{
        if(inventory2.contains(key1)){
            val value2 = inventory2(key1)

             mergedInventory += (key1 -> (value1._1, (value1._2+value2._2), math.max(value1._3, value2._3)))
        }
        }
      }
      println("\nInventory after merged: ")
      printf("\n%s %16s %16s %12s\n\n", "ID", "Name", "Quantity", "Price")
      mergedInventory.foreach((key, values) => {
        printf(
          "%d %16s %12d %15.2f\n",
          key,
          values._1,
          values._2,
          values._3
        )
      })
    } else if (choice == 5) {
      print("Enter product ID: ")
      var pId: Int = readLine().toInt
      if (inventory1.contains(pId)) {
        val product = inventory1(pId)
        println("\nProduct found in inventory1")

        print(
          s"ID: ${pId}\nName: ${product._1}\nQuantity: ${product._2}\nPrice: Rs.${product._3}\n"
        )

      } else if (inventory2.contains(pId)) {
        val product = inventory2(pId)
        println("\nProduct found in inventory2")

        print(
          s"ID: ${pId}\nName: ${product._1}\nQuantity: ${product._2}\nPrice: Rs.${product._3}\n"
        )

      } else {
        println(s"\nSorry! Product ID: ${pId} not avalilable.")
      }
    } else if (choice == 0) {
      return
    } else {
      println("Invalid choice. Please try again.")
    }
  }
}
