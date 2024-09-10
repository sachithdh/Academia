class Rational(val n: Int, val d: Int) {
  require(d != 0, "Denominator must be non-zero")

  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

  private val g = gcd(n.abs, d.abs)

  val numer: Int = n / g
  val denom: Int = d / g

  def sub(that: Rational) =
    new Rational(numer * that.denom - denom * that.numer, denom * that.denom)

  override def toString: String = s"$n/$d"

}

object Q2 extends App {
  val x = new Rational(3, 4)
  val y = new Rational(5, 8)
  val z = new Rational(2, 7)

  println(s"x-y-z = ${x.sub(y).sub(z)}")
}
