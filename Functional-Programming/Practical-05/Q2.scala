import scala.io.StdIn._
import scala.collection.mutable.ListBuffer
import scala.collection.mutable.Set

case class Book(title: String, author: String, isbn: String)

var library: Set[Book] = Set(
    Book("The Catcher in the Rye", "J.D. Salinger", "978-0-316-76948-0"),
    Book("To Kill a Mockingbird", "Harper Lee", "978-0-06-112008-4"),
    Book("1984", "George Orwell", "978-0-452-28423-4")
)

def addBook(): Unit = {
    val title = readLine("Enter title: ")
    val author = readLine("Enter author name: ")
    val isbn = readLine("Enter ISBN: ")

    val newBook = Book(title, author, isbn)
    library += newBook

    println(s"Book ${title} added to the Library.")
}

def removeBook(): Unit = {
    val isbn = readLine("Enter ISBN of the book: ")

    library.find(_.isbn == isbn) match {
        case Some(book) => 
            library -= book
            println(s"Book ${book.title} removed successfully")
        case None => println(s"No book found with ISBN: $isbn")
    }
}


def displayLibrary(): Unit = {
    println("\nCurrent Library Book Collection:")
    library.foreach(book => println(s"Title: ${book.title}, Author: ${book.author}, ISBN: ${book.isbn}"))
}
Enter
def searchBook():Unit ={
    val title = readLine("Enter Book title: ")

    library.find(_.title.equalsIgnoreCase(title)) match {
        case Some(book) => println(s"Book found: Title: ${book.title}, Author: ${book.author}, ISBN: ${book.isbn}")
        case None => println(s"No book found with title: $title")
    }
}

def serchAuthorBook(): Unit = {
    val author = readLine("Enter author name: ")

    val booksByAuthor = library.filter(_.author.equalsIgnoreCase(author))
    if (booksByAuthor.nonEmpty) {
      println(s"Books by $author:")
      booksByAuthor.foreach(book => println(s"Title: ${book.title}, ISBN: ${book.isbn}"))
    } else {
      println(s"No books found by author: $author")
    }
}

@main def Q2(): Unit = {
    while (true){
        // Headers
        println("__________________________________________________________")
        println("\n1. Add Book")
        println("2. Remove Book")
        println("3. Search Book by Title")
        println("4. Search Book by Author")
        println("5. Display the current Library books")
        println("0. exit")

        print("Enter Your choice: ")
        var choice: Int = readLine().toInt

        if (choice == 1){
            addBook()
        } else if (choice == 2){
            removeBook()
        } else if (choice == 3){
            searchBook()
        } else if(choice == 4){
            serchAuthorBook()
        } else if(choice == 5){
            displayLibrary()
        } else if(choice == 0){
            return
        }else {
            println("Invalid choice. Please try again.")
        }
    }
}