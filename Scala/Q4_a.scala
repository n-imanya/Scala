object Main extends App {

    print("Enter no.of working hours : ");
    var hours = scala.io.StdIn.readInt();
    print("Enter no.of OT hours : ");
    var othours = scala.io.StdIn.readInt();

    def wage(hours:Int):Int = hours*250;
    def ot(othours:Int):Int = othours*85;
    def income(h1:Int, h2:Int):Int = wage(h1)+ot(h2);
    def tax(income:Int):Int = income*12/100;
    def salary(h1:Int, h2:Int):Double = income(h1,h2)-tax(income(h1,h2)); 

    println("Take home salary = "+salary(hours,othours));
    
}