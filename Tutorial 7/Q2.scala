object Q2 extends App{
  val r1 = new RationalNum(3,4)
  val r2 = new RationalNum(5,8)
  val r3 = new RationalNum(2,7)

  val r = (r1.sub(r2)).sub(r3)

  println(r)
}

class RationalNum(n:Int, d:Int) {
  require(denominator > 0, "Denominator must be greater than 0")
  def numerator = n
  def denominator = d

  def sub(r:RationalNum) = new RationalNum(this.numerator*r.denominator - this.denominator*r.numerator, this.denominator*r.denominator)

  override def toString(): String = numerator + "/" + denominator

}