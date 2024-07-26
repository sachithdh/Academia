// Conver string to upper case
def toUpper(str: String): String ={
    val offset = 'A' - 'a'

    var upperStr = str.map(c => {
        if(c >= 'a' && c <= 'z'){
            (c+offset).toChar
        } else {
            c
        }
    })
    upperStr
}

// Convert string to lower case
def toLower(str: String): String = {
    val offset = 'a' - 'A'
    val lowerStr = str.map(c => {
        if(c >= 'A' && c<= 'Z'){
            (c+offset).toChar
        } else {
            c
        }
    })
    lowerStr
}

// Apply given format to a string
def formatNames(name: String)(format: String => String): String = {
    format(name)
}

@main def Q3(): Unit = {

    // Converts string based on given format
    val benny = formatNames("Benny")(toUpper)
    val niroshan = formatNames("Niroshan")(name => {
      s"${toUpper(name.substring(0, 2))}${toLower(name.substring(2))}"
    })
    val saman = formatNames("Saman")(toLower)
    val kumara = formatNames("Kumara")(name => {
      s"${name(0)}${toLower(name.substring(1, name.length - 1))}${toUpper(name.substring(name.length - 1))}"
    })

    println(benny)
    println(niroshan)
    println(saman)
    println(kumara)

}