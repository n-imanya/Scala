object Q4 extends App {

    print("Enter the book quantity : ");
    var quantity = scala.io.StdIn.readInt();

    def total(x:Int):Double = x*24.95;
    def discount(amount:Double):Double = amount*40/100;
    def shipping(x:Int):Double = 3*x+(x-50)*0.75;
    def wholesale(x:Int):Double = total(x) - discount(total(x)) + shipping(x);

    println("Total wholesale cost = "+ wholesale(quantity));

}