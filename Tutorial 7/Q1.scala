object Q1 extends App {
    val r1 = new RationalNum(1,2)
    println(r1.neg)
}

class RationalNum(n:Int, d:Int) {
    
    require(d > 0, "Denominator must be greater than 0")
    def neg = new RationalNum(-this.n, this.d)
    override def toString(): String = n + "/" + d
}