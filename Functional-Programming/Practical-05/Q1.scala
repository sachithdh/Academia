import scala.io.StdIn._
import scala.collection.mutable.ListBuffer

def getProductList(): ListBuffer[String] = {
    var productNameList = ListBuffer[String]()
    var productName: String = ""
    while (productName != "done"){
        productName = readLine("Enter Product name(enter \"done\" to quit): ")
        if(productName != "done"){
            productNameList += productName
        }

    }
    productNameList
}


def printProductList(producttNames: List[String]): Unit = {
    println("\nProduct List:")
    for(i <- 0 to producttNames.length - 1){
        printf("%d %5s\n", (i+1), producttNames(i))
    }
}

def getTotalProducts(productNames: List[String]): Int ={
    productNames.length
}
@main def Q1(): Unit = {
    // println(getTotalProducts(getProductList().toList))
    var productNameList = ListBuffer[String]()
    while (true){
        // Headers
        println("__________________________________________________________")
        println("\n1. Add Product")
        println("2. Get products")
        println("3. Total no. of Products")
        println("0. exit")

        print("Enter Your choice: ")
        var choice: Int = readLine().toInt

        if (choice == 1){
            productNameList = getProductList()
        } else if (choice == 2){
            printProductList(productNameList.toList)
        } else if (choice == 3){
            println(s"Total No. of Products = ${getTotalProducts(productNameList.toList)}")
        } else if(choice == 0){
            return
        }else {
            println("Invalid choice. Please try again.")
        }
    }
    
}