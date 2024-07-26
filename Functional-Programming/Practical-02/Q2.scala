object Q2{
    def main(args: Array[String]): Unit = {
        var a: Int = 2
        var b: Int = 3
        var c: Int = 4
        var d: Int = 5
        var k: Float = 4.3f
        
        // - -b * a + c *d - -
        b -= 1
        println(s"a). ${b* a + c *d}")
        d -= 1

        // a++
        println(s"b). $a")
        a += 1

        // –2 * ( g – k ) +c
        // println(s"c). ${-2 * (g - k)+c}")

        // c=c++
        println(s"d). $c")
        c += 1

        // c=++c*a++
        c += 1
        c = c * a
        println(s"e). ${c}")
        a += 1

        
    }
}
