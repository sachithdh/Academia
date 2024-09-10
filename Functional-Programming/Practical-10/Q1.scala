class Rational(n: Int, d: Int) {
  require(d != 0, "Denominator cannot be zero")

  def neg: Rational = new Rational(-n, d)

  override def toString: String = s"$n/$d"
}

object Main extends App {
  val x = new Rational(9, 12)
  val y = x.neg
  println(s"x = $x")
  println(s"x.neg = $y")
}
