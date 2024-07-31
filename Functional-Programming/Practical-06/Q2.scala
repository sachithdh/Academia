import scala.io.StdIn._

def validateInput(name: String, marks: Int, totalMarks: Int): (Boolean, String, Int) = {
    var isValid: Boolean = true
    var errorMessage: String = ""

    if (name.trim.isEmpty){
        isValid = false
        errorMessage = "Error: Name cannot be empty.\n"

        return (isValid, errorMessage, marks)
    }
    if (marks < 0){
        if (marks >= -10){
            return (isValid, errorMessage, 0)
        } else {
            isValid = false
            errorMessage = "Error: Invalid marks\n"
            return (isValid, errorMessage, marks)
        }
    }
    
    if(marks > totalMarks){
        isValid = false
        errorMessage = s"Error: Marks cannot be greater than ${totalMarks}.\n"
        return (isValid, errorMessage, marks)
    }

    return (isValid, errorMessage, marks)
}

def getStudentInfoWithRetry() ={
    getStudentInfo()
}

def getStudentInfo(): Option[(String, Int, Int, Double, Char)] ={
    val name: String = readLine("Student name: ").trim
    var marks: Int = readLine("Marks: ").toInt
    val totalMarks: Int = readLine("Total possible marks: ").toInt

    val (isValid, errorMessage, finalMarks) = validateInput(name, marks, totalMarks)
    var percentage: Double = 0
    var grade: Char = ' '
    
    isValid match{
        case true => {
            var 
            percentage = (finalMarks.toDouble / totalMarks) * 100
            percentage match {
                case x if(x >= 90) => grade = 'A'
                case x if(x >= 75) => grade = 'B'
                case x if(x >= 50) => grade = 'C'
                case _ => grade = 'D'
            }
             Some((name, finalMarks, totalMarks, percentage, grade))
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