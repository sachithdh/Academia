@main def Q3(): Unit = {
    val toUpper: String => String = (str: String) => {
        str.map(ch => ch.toUpper)
    }
    val toLower: String => String = (str: String) => {
        str.map(ch => ch.toLower)
    }

    val formatNames: (String, String => String) => String = (name: String, method: String => String) => {
        method(name)
    }

    val name1 = "Benny"
    val name2 = "Niroshan"
    val name3 = "Saman"
    val name4 = "Kumara"

    println(formatNames(name1, toUpper))
    println(formatNames(name2.substring(0, 2), toUpper) + name2.substring(2))
    println(formatNames(name3, toLower))
    println(name4.substring(0, 5) + formatNames(name4.substring(5), toUpper))
}