object Q1 extends App {

    def interest(amount: Double): Double = amount match{
        case x if x<=20000 => x*2/100
        case x if x<=200000 => x*4/100
        case x if x<=2000000 => x*3.5/100
        case x if x>2000000 => x*6.5/100
    }

    print("Enter amount: ");
    var amount = scala.io.StdIn.readDouble();
    println("Interest = " +interest(amount))
}