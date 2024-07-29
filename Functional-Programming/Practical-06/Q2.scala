import scala.io.StdIn._
import scala.annotation.retains

def validateInput(name: String, marks: Int, totalMarks: Int): (Boolean, String) = {
    var isValid: Boolean = true
    var errorMessage: String = ""

    if (name.trim.isEmpty){
        isValid = false
        errorMessage = "Error: Name cannot be empty.\n"

        return (isValid, errorMessage)
    }
    if (marks < 0){
        isValid = false
        errorMessage = "Error: Marks cannot be negative.\n"
        return (isValid, errorMessage)
    }
    
    if(marks > totalMarks){
        isValid = false
        errorMessage = s"Error: Marks cannot be greater than ${totalMarks}.\n"
        return (isValid, errorMessage)
    }

    return (isValid, errorMessage)
}

def getStudentInfoWithRetry() ={
    getStudentInfo()
}

def getStudentInfo(): Option[(String, Int, Int, Double, Char)] ={
    val name: String = readLine("Student name: ").trim
    val marks: Int = readLine("Marks: ").toInt
    val totalMarks: Int = readLine("Total possible marks: ").toInt

    val (isValid, errorMessage) = validateInput(name, marks, totalMarks)
    var percentage: Double = 0
    var grade: Char = ' '
    
    isValid match{
        case true => {
            percentage = (marks.toDouble / totalMarks) * 100
            percentage match {
                case x if(x >= 90) => grade = 'A'
                case x if(x >= 75) => grade = 'B'
                case x if(x >= 50) => grade = 'C'
                case _ => grade = 'D'
            }
             Some((name, marks, totalMarks, percentage, grade))
        }
        case false => {
            println(errorMessage)
            getStudentInfoWithRetry()
        }
    }

}

def printStudentRecord(record: (String, Int, Int, Double, Char)): Unit ={
    val (name, marks, totalMarks, percentage, grade) = record

    println("\n* Student Record:")
    println(s"Name: $name")
    println(s"Marks: $marks")
    println(s"Total possible Marks: $totalMarks")
    println(s"Percentage: $percentage%")
    println(s"Grade: $grade")
}

@main def Q2() ={
    val value =  getStudentInfo()

    value match {
        case Some(records) => printStudentRecord(records)
        case None => println("\nNo value to print")
    }
    
    }