import scala.io.StdIn._

def encrypt(message: String, key: Int): String = {
    message.map{
        
            case c if c.isLetter => 
                val offset = if(c.isUpper) 'A' else 'a'
                ((c - offset + key) % 26 + offset).toChar
            case c if (c.isDigit) => 
                val offset = '0'
                ((c - offset + key) % 10 + offset).toChar
            case c => c
        }.mkString
}

def decrypt(message: String, key: Int): String = {
    message.map{
        case c if c.isLetter =>
            val offset = if (c.isUpper) 'A' else 'a'
            ((c - offset - key + 26) % 26 + offset).toChar
        case c if (c.isDigit) => 
            val offset = '0'
            ((c - offset - key) % 10 + offset).toChar
        case c => c

    }.mkString
}

def cipher(message: String, key: Int, mode: (String, Int) => String): String ={
    mode(message, key)
}

@main def Q1(): Unit = {
    println(cipher("HELLO", 2, encrypt))

    print("\nEnter Your Message: ")
    val message = readLine()

    print("Enter Key: ")
    val key = readInt()

    print("Mode (e - encrypt/d - decrypt): ")
    val mode = readLine().toLowerCase()

    val modeFunc = mode match {
        case "e" => encrypt
        case "d" => decrypt
        case _ => {
            println("Invalid mode, defaulting to encrypt.") 
            encrypt}
    }

    val result = cipher(message, key, modeFunc)
    println(s"Message: $result")
}
